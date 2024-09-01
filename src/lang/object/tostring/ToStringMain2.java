package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car= new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());  // 출력값 lang.object.tostring.Car@4e50df2e
        // car는 object의 기본 기능 객체주소값
        System.out.println(dog1.toString()); // Dog{dogName='멍멍이1', age=2}
        // dog는 직접 tostring을 재정의한 메서드로 출력
        System.out.println(dog2.toString()); // Dog{dogName='멍멍이2', age=5}


        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);  // 같음
        System.out.println(dog1); // 같음
        System.out.println(dog2); // 같음

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String ref = Integer.toHexString(System.identityHashCode(dog1));// toString을 오버라이딩 해버린 상태라 객체주소값을 알고 싶을때 사용
        // Integer.toHexString 16진수 변환
        System.out.println("ref = " + ref);

    }
}
