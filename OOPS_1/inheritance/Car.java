package OOPS_1.inheritance;
// If any abstract method is present in class so we have to make that class also abstract 
public abstract class Car {
    String name;
    String engine;
    int wheels;

    public void accelarate() {
        System.out.println("Accelerate Car");
    }

    public void applyBreaks() {
        System.out.println("Apply Breaks Car");
    }
  
    public void playRadio() {
        System.out.println("Playing Radio");
    }

    public abstract void useSteringWheel();
}
