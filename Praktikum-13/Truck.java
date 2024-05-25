// Truck.java
public class Truck extends Vehicle {
    private double maxLoad;

    public Truck(double maxLoad) {
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
    public String toString() {
        return super.toString() + " adalah angkutan darat yang sangat handal";
    }
}