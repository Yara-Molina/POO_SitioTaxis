package Models;

import java.util.ArrayList;
import java.util.List;

public class Chofer {
    private String nombre;
    private String apellido;
    private List<Servicio> servicios;

    public Chofer(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.servicios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void registrarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    public double calcularGanancias() {
        double totalGanancias = 0.0;
        for (Servicio servicio : servicios) {
            totalGanancias += servicio.getCosto();
        }
        return totalGanancias;
    }
}


