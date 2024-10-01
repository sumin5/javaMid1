package nested.local;

public class LocalOuterV1 {

    private int outInstancVar = 3;
    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter{
            int value = 0;

            public void printData(){ // 지역클래스
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramvar = " + paramVar);
                System.out.println("outInstancVar = " + outInstancVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();

    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(1);
    }

}
