package Models;

import java.util.Date;

public class Servicio {
    private Date fecha;
    private double costo;

    public Servicio(double costo) {
        this.costo = costo;
        this.fecha = new Date(); // Fecha actual al crear el servicio
    }

    public double getCosto() {
        return costo;
    }

    public Date getFecha() {
        return fecha;
    }
}



