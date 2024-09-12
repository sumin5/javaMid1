package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new String() equals 비교 : " + str1.equals(str2));

        String str3 = "hello"; // 문자열 리터럴은 실행시점에 String pool에 객체 생성
        String str4 = "hello"; // 같은 값을 만들면 새로 만들지않고 같은객체를 참조하게 세팅

        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
    }
}
