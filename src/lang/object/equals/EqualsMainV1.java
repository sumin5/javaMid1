package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1== user2)); // 결과값 : identity = false // 참조값이 서로 다르기때문
        System.out.println("equality = " + (user1.equals(user2))); // 결과값 : identity = false // Object가 기본으로 제공하는것은 == 비교이기 때문
    }
}
