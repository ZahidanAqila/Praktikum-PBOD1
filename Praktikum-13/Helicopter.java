// Helicopter.java
public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public double calcFuelEfficency() {
        return 0; // Implement as needed
    }

    @Override
    public double calcTripDistance() {
        return 0; // Implement as needed
    }

    @Override
    public void takeOff() {
        // Implement as needed
    }

    @Override
    public void land() {
        // Implement as needed
    }

    @Override
    public void fly() {
        // Implement as needed
    }

    @Override
    public String toString() {
        return super.toString() + " hanya memerlukan landasan kecil";
    }
}
