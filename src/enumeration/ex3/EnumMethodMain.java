package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 enum 반환
        ClassGrade[] values = ClassGrade.values();
        System.out.println("values = " + Arrays.toString(values));

        for (ClassGrade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환
        String input = "GOLD";
        //String input = "gold"; // 예외 발생 IllegalArgumentException: No enum constant enumeration.ex3.Grade.gold
        ClassGrade gold = ClassGrade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 가능
    }
}
