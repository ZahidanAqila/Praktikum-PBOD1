// Airplane.java
public abstract class Airplane extends Vehicle implements IFlyer {
    @Override
    public abstract void takeOff();

    @Override
    public abstract void land();

    @Override
    public abstract void fly();
}