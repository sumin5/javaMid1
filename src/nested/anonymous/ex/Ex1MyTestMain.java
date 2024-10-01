package nested.anonymous.ex;

import java.util.Random;

public class Ex1MyTestMain {

    public static void helloDice(){
        System.out.println("프로그램 시작");

        //코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        process process = new helloDice();        // 코드 조각 종료
        process.run();
        System.out.println("주사위 = " + randomValue);

        // 코드 조각 종료

        System.out.println("프로그램 종료");

    }

    public static void helloSum(){
        System.out.println("프로그램 시작");

        //코드 조각 시작

        process process = new helloSum();        // 코드 조각 종료
        process.run();

        System.out.println("프로그램 종료");

    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }

    static class helloDice implements process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);

        }
    }

    static class helloSum implements process {

        @Override
        public void run() {
            for (int i=0; i<3; i++) {
                System.out.println("i = " + i);
            }

        }
    }

    public interface process {
        void run();
    }
}
