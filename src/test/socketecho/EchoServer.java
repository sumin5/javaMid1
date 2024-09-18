package test.socketecho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServer {
    public static void main(String[] args) throws Throwable {


        // 서버 소켓 생성 (포트 8080에서 클라이언트 연결 대기)
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 시작.");

        // 클라이언트가 연결될 때까지 대기
        Socket clientSocket = serverSocket.accept();

        long currentTimeMillis = System.currentTimeMillis();
        // 밀리초 단위 시간을 Date 객체로 변환
        Date currentDate = new Date(currentTimeMillis);

        System.out.println("클라이언트 응답 요청 시간 = " + currentDate);
        System.out.println("클라이언트 연결완료");

        // 클라이언트로부터 데이터를 받기 위한 입력 스트림 생성
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // 클라이언트 소켓에서 들어오는 바이트 데이트를 문자로 읽음
        // 클라이언트에게 데이터를 보내기 위한 출력 스트림 생성
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // 바이트 단위로 데이터를 클라이언트로 전송 역할

        String inputLine;
        // 클라이언트로부터 데이터를 계속해서 읽음 null이 아닐때까지
        try{
            while ((inputLine = in.readLine()) != null) {

                System.out.println("받은 메시지 : " + inputLine);
                // 받은 메시지를 그대로 클라이언트에게 다시 전송 (에코)
                out.println(inputLine);
                // 'exit' 메시지가 들어오면 서버 종료
                if (inputLine.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e){
            System.err.println("입출력 예외 발생 " +  e.getMessage());
        } finally {
            // 종료시 클라이언트 소켓과 서버 소켓 닫기
            clientSocket.close();
            serverSocket.close();
            System.out.println("서버 종료.");
        }

    }
}
