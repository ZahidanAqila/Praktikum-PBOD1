// AirPort.java
public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Permission granted to land";
        } else {
            return "Permission denied to land";
        }
    }
}