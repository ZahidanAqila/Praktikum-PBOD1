// SeaPlane.java
public class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane(double maxLoad) {
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
        return super.toString() + " dapat take-off dan mendarat di perairan laut";
    }
}
