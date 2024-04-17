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
                boolean ejecutarPrincipal = true;
                while (ejecutarPrincipal) {
                    System.out.println("-------------Menu principal-------------");
                    System.out.println("1. Administrador");
                    System.out.println("2. Chofer");
                    System.out.println("x. Salir");
                    System.out.println("----------------------------------------");

                    String opcion = scanner.next();
                    switch (opcion) {
                        case "1":
                            boolean ejecutar1 = true;
                            while (ejecutar1) {
                                System.out.println("...............Menu de administrador.................");
                                System.out.println("1. Registrar nuevos vehiculos");
                                System.out.println("2. Registrar chofer");
                                System.out.println("3. Asignar vehiculos a choferes");
                                System.out.println("x. Salir a menu principal");
                                System.out.println("....................................................");
                                String opcion1 = scanner.next();
                                switch (opcion1) {
                                    case "1":
                                        System.out.println("Ingrese nombre del vehiculo: ");
                                        String nombreV = scanner.next();
                                        System.out.println("Ingrese color: ");
                                        String color = scanner.next();
                                        System.out.println("Ingrese matricula: ");
                                        String matricula = scanner.next();
                                        Vehiculo vehiculo = new Vehiculo(nombreV, matricula, color);
                                        empresa.agregarVehiculo(vehiculo);
                                        System.out.println("Registro exitoso!");
                                        break;
                                    case "2":
                                        System.out.println("Ingrese nombre del chofer: ");
                                        String nombre = scanner.next();
                                        System.out.println("Ingrese apellido del chofer: ");
                                        String apellido = scanner.next();
                                        Chofer chofer = new Chofer(nombre, apellido);
                                        empresa.agregarChofer(chofer);
                                        System.out.println("Registro exitoso!");
                                        break;
                                    case "3":
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

                                        Chofer chofer1 = empresa.getChofers().get(indiceChofer);
                                        Vehiculo vehiculo1 = empresa.getVehiculos().get(indiceVehiculo);

                                        empresa.asignarVehiculoAChofer(chofer1, vehiculo1);
                                        System.out.println("Vehículo asignado correctamente!");
                                        break;
                                    case "x":
                                        ejecutar1 = false;
                                        break;
                                    default:
                                        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                                        break;
                                }
                            }
                            break;
                        case "2":
                            boolean ejecutar2 = true;
                            while (ejecutar2) {
                                System.out.println("---------------Menu del chofer---------------");
                                System.out.println("1. Registrar servicios del dia");
                                System.out.println("2. Calcular ganancia del dia");
                                System.out.println("x. Salir a menu principal");
                                System.out.println("----------------------------------------------");
                                String opcion2 = scanner.next();
                                switch (opcion2) {
                                    case "1":
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

                                        break;
                                    case "2":
                                        System.out.println("---Ganancia del dia---");
                                        System.out.println("Seleccione el chofer para ver su ganancia del día: ");
                                        for (int i = 0; i < empresa.getChofers().size(); i++) {
                                            System.out.println((i + 1) + "._" + empresa.getChofers().get(i).getNombre());
                                        }
                                        int indiceChofer1 = scanner.nextInt() - 1;
                                        Chofer chofer1 = empresa.getChofers().get(indiceChofer1);
                                        double gananciaDia = chofer1.calcularGanancias();
                                        System.out.println("Ganancia del día para " + chofer1.getNombre() + ": " + gananciaDia);
                                        break;
                                }
                            }
                    }
                }
            }
        }








