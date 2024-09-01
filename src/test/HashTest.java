package test;

import java.util.HashMap;

public class HashTest {

    public static void main(String[] args) {

        HashMap<Person, String> map = new HashMap<>();
        Person person = new Person("John Doe", 30);
        map.put(person, "Developer");

// 상태 변경
        person.setAge(31);

// 해시 코드 변경 가능성
// 이제 person 객체를 다시 검색하려 할 때 문제가 발생할 수 있음
        String jobTitle = map.get(person); // 이 코드는 null을 반환할 수 있음
        System.out.println(jobTitle);
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
