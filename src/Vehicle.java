abstract class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;
    }

    abstract void startEngine();
    abstract void stopEngine();
}
