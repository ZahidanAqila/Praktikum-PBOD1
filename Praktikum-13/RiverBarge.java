// RiverBarge.java
public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(double maxLoad) {
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
}