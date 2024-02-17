package Models;
import java.util.Date;

public class Servicio {
        private Date fecha;

        private double costo;

        public Servicio(double costo){
            this.costo=costo;
        }
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setFecha(Date fecha){
            this.fecha=fecha;
    }
    public Date getFecha() {
        return fecha;
    }
}

