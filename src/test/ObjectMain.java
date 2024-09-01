package test;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        // toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
    }
}

class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }

}

class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    @Override
    public String toString() {
        return "overRidding";
    }
}