package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1); // 불변객체에서 값을 변환하려면 무조건 반환객체를 통해서 받아야한다 .
        System.out.println("date2 = " + date2);

    }
}
