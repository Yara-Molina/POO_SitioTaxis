package Models;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Servicio> servicios;

    public Registro(){
        servicios= new ArrayList<>();
    }

    public void registrarServicio(Servicio servicio){
        servicios.add(servicio);
    }

    public double calcularGanancias() {
        double totalGanancias = 0.0;
        for (Servicio servicio : servicios) {
            totalGanancias += servicio.getCosto();
        }
        return totalGanancias;
    }
}
