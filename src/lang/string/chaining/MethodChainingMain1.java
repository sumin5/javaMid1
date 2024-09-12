package lang.string.chaining;

public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder1 adder1 = new ValueAdder1();
        adder.add(1);
        adder.add(2);
        adder.add(3);
        int result = adder.getValue();
        System.out.println("result = " + result);
    }
}

class ValueAdder1 {

    private int value;

    public ValueAdder1 add(int addValue){
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}