package lang.clazz;

public class Hello {

    public String hello(){
        return "hello!";
    }

    private String notAcess(){
        System.out.println("어떻게 접근했니 ?");
        return "어떻게 접근했니 ?";
    }
}
