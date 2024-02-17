package Models;

import java.util.ArrayList;

public class Chofer {
private String nombreC;
private String apellidoC;
public ArrayList<Chofer>chofers;
private Vehiculo vehiculoAsig;

public Chofer(String nombreC, String apellidoC){
    this.nombreC= nombreC;
    this.apellidoC= apellidoC;
}

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getApellidoC() {
        return apellidoC;
    }

    public void setApellidoC(String apellidoC) {
        this.apellidoC = apellidoC;
    }

    public ArrayList<Chofer> getChofers() {
        return chofers;
    }

    public Vehiculo getVehiculoAsig() {
        return vehiculoAsig;
    }

    public void setVehiculoAsig(Vehiculo vehiculoAsig) {
        this.vehiculoAsig = vehiculoAsig;
    }
}
