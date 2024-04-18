package Models;

import java.time.LocalDateTime;

public class Servicio {
    private double costo;
    private LocalDateTime fecha;
    private Chofer chofer;

    public Servicio(double costo) {
        this.costo = costo;
        this.fecha = LocalDateTime.now();
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }
}




