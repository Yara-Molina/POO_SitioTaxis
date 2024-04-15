import Models.Chofer;
import Models.Servicio;
import Models.SitioTaxis;
import Models.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SitioTaxis empresa = new SitioTaxis();

        boolean ejecutar = true;
        while (ejecutar) {
            System.out.println("-------------Menu principal-------------");
            System.out.println("1. Administrador");
            System.out.println("2. Chofer");
            System.out.println("x. Salir");
            System.out.println("----------------------------------------");

            String opcion = scanner.next();
            switch (opcion) {
                case "1":
                    ejecutarMenuAdministrador(scanner, empresa);
                    break;
                case "2":
                    ejecutarMenuChofer(scanner, empresa);
                    break;
                case "x":
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }

    private static void ejecutarMenuAdministrador(Scanner scanner, SitioTaxis empresa) {
        boolean ejecutar = true;
        while (ejecutar) {
            System.out.println("...............Menu de administrador.................");
            System.out.println("1. Registrar nuevos vehiculos");
            System.out.println("2. Registrar chofer");
            System.out.println("3. Asignar vehiculos a choferes");
            System.out.println("x. Salir a menu principal");
            System.out.println("....................................................");

            String opcion = scanner.next();
            switch (opcion) {
                case "1":
                    registrarVehiculo(scanner, empresa);
                    break;
                case "2":
                    registrarChofer(scanner, empresa);
                    break;
                case "3":
                    asignarVehiculoAChofer(scanner, empresa);
                    break;
                case "x":
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }

    private static void registrarVehiculo(Scanner scanner, SitioTaxis empresa) {
        System.out.println("Ingrese nombre del vehiculo: ");
        String nombreV = scanner.next();
        System.out.println("Ingrese color: ");
        String color = scanner.next();
        System.out.println("Ingrese matricula: ");
        String matricula = scanner.next();
        Vehiculo vehiculo = new Vehiculo(nombreV, matricula, color);
        empresa.agregarVehiculo(vehiculo);
        System.out.println("Registro exitoso!");
    }

    private static void registrarChofer(Scanner scanner, SitioTaxis empresa) {
        System.out.println("Ingrese nombre del chofer: ");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido del chofer: ");
        String apellido = scanner.next();
        Chofer chofer = new Chofer(nombre, apellido);
        empresa.agregarChofer(chofer);
        System.out.println("Registro exitoso!");
    }

    private static void asignarVehiculoAChofer(Scanner scanner, SitioTaxis empresa) {
        System.out.println("---Asignar vehículo---");
        System.out.println("Choferes disponibles: ");
        for (int i = 0; i < empresa.getChofers().size(); i++) {
            System.out.println((i + 1) + "._" + empresa.getChofers().get(i).getNombre());
        }
        System.out.println("Seleccione chofer: ");
        int indiceChofer = scanner.nextInt() - 1;

        System.out.println("--Asignar vehículo--");
        for (int i = 0; i < empresa.getVehiculos().size(); i++) {
            System.out.println((i + 1) + "._" + empresa.getVehiculos().get(i).getNombre());
        }
        System.out.println("Seleccione vehículo: ");
        int indiceVehiculo = scanner.nextInt() - 1;

        Chofer chofer = empresa.getChofers().get(indiceChofer);
        Vehiculo vehiculo = empresa.getVehiculos().get(indiceVehiculo);

        empresa.asignarVehiculoAChofer(chofer, vehiculo);
        System.out.println("Vehículo asignado correctamente!");
    }

    private static void ejecutarMenuChofer(Scanner scanner, SitioTaxis empresa) {
        System.out.println("---------------Menu del chofer---------------");
        System.out.println("1. Registrar servicios del dia");
        System.out.println("2. Calcular ganancia del dia");
        System.out.println("x. Salir a menu principal");
        System.out.println("----------------------------------------------");
        String opcion = scanner.next();
        switch (opcion) {
            case "1":
                registrarServicio(scanner, empresa);
                break;
            case "2":
                // Mostrar ganancia del día para el chofer
                System.out.println("---Ganancia del dia---");
                System.out.println("Seleccione el chofer para ver su ganancia del día: ");
                for (int i = 0; i < empresa.getChofers().size(); i++) {
                    System.out.println((i + 1) + "._" + empresa.getChofers().get(i).getNombre());
                }
                int indiceChofer = scanner.nextInt() - 1;
                Chofer chofer = empresa.getChofers().get(indiceChofer);
                double gananciaDia = chofer.calcularGanancias();
                System.out.println("Ganancia del día para " + chofer.getNombre() + ": " + gananciaDia);
                break;
            case "x":
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                break;
        }
    }

    private static void registrarServicio(Scanner scanner, SitioTaxis empresa) {
        System.out.println("Ingrese el costo del servicio: ");
        double costo = scanner.nextDouble();
        Servicio servicio = new Servicio(costo);

        System.out.println("Choferes disponibles: ");
        for (int i = 0; i < empresa.getChofers().size(); i++) {
            System.out.println((i + 1) + "._" + empresa.getChofers().get(i).getNombre());
        }
        System.out.println("Seleccione chofer: ");
        int indiceChofer = scanner.nextInt() - 1;

        Chofer chofer = empresa.getChofers().get(indiceChofer);
        chofer.registrarServicio(servicio);
        System.out.println("Servicio registrado correctamente!");
    }
}








