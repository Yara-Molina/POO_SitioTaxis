package Models;

public class Vehiculo {
    private String nombre;
    private String matricula;
    private String color;
    private Chofer choferAsignado;

    public Vehiculo(String nombre, String matricula, String color) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public Chofer getChoferAsignado() {
        return choferAsignado;
    }

    public void asignarChofer(Chofer chofer) {
        this.choferAsignado = chofer;
    }
}


