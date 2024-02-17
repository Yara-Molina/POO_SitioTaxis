package Models;
import java.util.ArrayList;

public class Vehiculo {
    private String nombreV;
    private String matricula;
    private String color;
    private Chofer choferAsig;

    public Vehiculo(String nombreV, String matricula, String color){
        this.nombreV=nombreV;
        this.matricula=matricula;
        this.color=color;
    }
    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chofer getChoferAsig() {
        return choferAsig;
    }

    public void setChoferAsig(Chofer choferAsig) {
        this.choferAsig= choferAsig;
    }
}
