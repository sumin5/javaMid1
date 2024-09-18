package test.socketecho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class EchoClient {
    public static void main(String[] args) throws IOException {

        // 현재 시간을 밀리초 단위로 얻기
        long currentTimeMillis = System.currentTimeMillis();
        // 밀리초 단위 시간을 Date 객체로 변환
        Date currentDate = new Date(currentTimeMillis);

        // 서버에 연결 (localhost의 8080 포트)
        Socket socket = new Socket("localhost", 8080);
        System.out.println("서버 연결완료");
        System.out.println("서버 시간 : " + currentDate);

        // 서버로부터 데이터를 받기 위한 입력 스트림 생성
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 서버 소켓에서 들어오는 바이트 데이트를 문자로 읽음
        // 서버로 데이터를 보내기 위한 출력 스트림 생성
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  // 바이트 단위로 데이터를 서버로 전송 역할
        // 사용자 입력을 받기 위한 스트림 생성 (콘솔 입력)
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        String userInput;
        System.out.println("메시지를 입력하세요. (exit 입력 시 종료)");

        try {
            // 사용자로부터 입력을 받아 서버에 전송하고, 서버의 응답을 출력
            while ( (userInput = stdIn.readLine()) != null) {
                // 사용자가 입력한 메시지를 서버로 전송
                out.println(userInput+new Date(System.currentTimeMillis()));
                // 서버로부터 응답 받은 메시지를 출력
                System.out.println("서버 응답: " + in.readLine());

                // 'exit' 입력 시 클라이언트 종료
                if (userInput.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("서버 에러 메시지 : " + e.getMessage());
        } finally {
            // 소켓 닫기
            socket.close();
            System.out.println("클라이언트 종료.");
        }

    }
}
