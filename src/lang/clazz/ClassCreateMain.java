package lang.clazz;

import java.lang.reflect.Method;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {

        //Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");


        //객체 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();

        // 메서드 생성
        Method privateMethod  = helloClass.getDeclaredMethod("notAccess");
        // 메서드 접근제어 해제
        privateMethod.setAccessible(true);
        // 메서드 호출
        privateMethod.invoke(hello);

    }
}
