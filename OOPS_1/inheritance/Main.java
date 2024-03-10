package OOPS_1.inheritance;

public class Main {

    public static void carTesting(Car car) {
            car.useSteringWheel();
    }
    public static void main(String[] args) {
        // Mercedes benz = new Mercedes();
        // benz.accelarate();
    // we can't create abstract class object 
        Car c = new Mercedes();
       c.useSteringWheel();
}
}
