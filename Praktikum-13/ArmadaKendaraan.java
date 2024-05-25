// ArmadaKendaraan.java
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArmadaKendaraan {
    private List<Vehicle> armada = new ArrayList<>();

    public void tambahArmada(Collection<? extends Vehicle> vehicles) {
        armada.addAll(vehicles);
    }

    public List<Vehicle> getAllArmada() {
        return armada;
    }
}