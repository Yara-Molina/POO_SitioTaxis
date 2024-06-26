package Models;

import java.util.ArrayList;
import java.util.List;

public class SitioTaxis {
    private ArrayList<Chofer> chofers;
    private ArrayList<Vehiculo> vehiculos;

    public SitioTaxis() {
        this.chofers = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public List<Chofer> getChofers() {
        return chofers;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarChofer(Chofer chofer, String apellido) {
        this.chofers.add(chofer);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public void asignarVehiculoAChofer(Chofer chofer, Vehiculo vehiculo) {
        vehiculo.asignarChofer(chofer);
    }

}

