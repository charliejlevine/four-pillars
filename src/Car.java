public class Car extends Vehicle {
    private String make;
    private String model;

    public Car(String make, String model) {
        super("Car");
        this.make = make;
        this.model = model;
    }

    @Override
    void startEngine() {
        System.out.println(this + " engine has started!");
    }

    @Override
    void stopEngine() {
        System.out.println(this + " engine has stopped!");
    }

    @Override
    public String toString() {
        return "[" + this.type + "] " + this.make + " " + this.model;
    }
}
