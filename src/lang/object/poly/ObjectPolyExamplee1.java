package lang.object.poly;

import java.util.HashMap;
import java.util.Map;

public class ObjectPolyExamplee1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    private static void action(Object obj){
        //dog.sound(); // 컴파일 오류 , Object는 sound()가 없다.
        //obj.move(); // 컴파일 오류 , Object는 move()가 없다.

        // 객체에 맞는 다운캐스팅 필요
        if ( obj instanceof Dog dog) {  // << 변수 선언 해주는건 자바 16부터 가능
            // 없었다면
            //Dog dog = (Dog) obj;
            //dog.sound();
            //옆에 클래스와 변수를 선언해주는 패턴은 Java 16부터 도입되었습니다.
            // 이 기능은 Pattern Matching for instanceof라고 불리며,
            // instanceof 연산자를 사용할 때 해당 객체가 특정 클래스의 인스턴스인지 확인하면서 동시에 변수를 선언하고 사용할 수 있도록 해줍니다.
            // 이를 통해 코드의 가독성을 높이고 불필요한 캐스팅을 줄일 수 있습니다.

            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }

    }
}
