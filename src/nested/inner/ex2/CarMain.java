package nested.inner.ex2;

import nested.inner.ex1.Car;

public class CarMain {

    public static void main(String[] args) {
        nested.inner.ex1.Car myCar = new Car("Model Y", 100);
        myCar.start();
    }
}
