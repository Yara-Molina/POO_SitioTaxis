import Models.Chofer;
import Models.Servicio;
import Models.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        ArrayList<Chofer>chofers= new ArrayList<>();
        ArrayList<Vehiculo>vehiculos = new ArrayList<>();
        ArrayList<Servicio>servicios= new ArrayList<>();
        Date fecha = new Date();
        do{
            System.out.println("-------------Menu principal-------------");
            System.out.println("1.Administrador");
            System.out.println("2.Chofer");
            System.out.println("x.Salir");
            System.out.println("----------------------------------------");

            String opcion = teclado.next();
            switch (opcion){
                case "1":
                    boolean bandera2= true;
                    do{
                        System.out.println("...............Menu de administrador.................");
                        System.out.println("1.Registrar nuevos vehiculos");
                        System.out.println("2.Registrar chofer");
                        System.out.println("3.Asignar vehiculos a choferes");
                        System.out.println("x.Salir a menu principal ");
                        System.out.println("....................................................");
                        String opcion2 = teclado.next();
                        switch (opcion2){
                            case "1":
                                System.out.println("Ingrese nombre del vehiculo: ");
                                String nombreV=teclado.next();
                                System.out.println("Ingrese color: ");
                                String color= teclado.next();
                                System.out.println("Ingrese matricula: ");
                                String matricula= teclado.next();
                                Vehiculo vehiculo1 = new Vehiculo(nombreV,matricula,color);
                                vehiculos.add(vehiculo1);
                                System.out.println("Regristro exitoso!");
                                break;
                            case "2":
                                System.out.println("Ingrese nombre del chofer: ");
                                String nombreC=teclado.next();
                                System.out.println("Ingrese apellido del chofer: ");
                                String apellidoC= teclado.next();
                                Chofer chofer = new Chofer(nombreC,apellidoC);
                                chofers.add(chofer);
                                System.out.println("Regristro exitoso!");
                                break;
                            case "3":
                                //chofer
                                System.out.println("---Asignar chofer:---");
                                System.out.println("Choferes disponibles: ");
                                for (int i = 0; i < chofers.size(); i++) {
                                    System.out.println((i + 1) + "._" + chofers.get(i).getNombreC());
                                }
                                System.out.println("Seleccione chofer: ");
                                int indiceChofer = teclado.nextInt() - 1;
                                Chofer choferSeleccionado = chofers.get(indiceChofer);
                                System.out.println("--Asignar vehículo--");
                                for (int i = 0; i < vehiculos.size(); i++) {
                                    System.out.println((i + 1) + "._" + vehiculos.get(i).getNombreV());
                                }
                                System.out.println("Seleccione vehículo: ");
                                int indiceVehiculo = teclado.nextInt() - 1;
                                Vehiculo vehiculoSeleccionado = vehiculos.get(indiceVehiculo);
                                choferSeleccionado.setVehiculoAsig(vehiculoSeleccionado);
                                System.out.println("Vehículo asignado correctamente!");
                                System.out.println("¿Desea ver la lista de vehículos asignados? S/N");
                                String correct = teclado.next();
                                if (correct.equals("s")) {
                                    // Mostrar la lista de vehículos asignados a los choferes
                                    System.out.println("Lista de vehículos asignados a los choferes:");
                                    for (Chofer choferAct : chofers) {
                                        System.out.println("Chofer: " + choferAct.getNombreC());
                                        Vehiculo vehiculoAsignado = choferAct.getVehiculoAsig();
                                        if (vehiculoAsignado != null) {
                                            System.out.println("Vehículo asignado: " + vehiculoAsignado.getNombreV());
                                            System.out.println("----------------------------------------------------");
                                        } else {
                                            System.out.println("No hay vehículo asignado");
                                        }
                                    }
                                }
                                break;
                            default:
                                bandera2=false;
                                System.out.println("Saliendo al menu principal.......");
                                break;
                        }
                    }while(bandera2);
                    break;
                case "2":
                    boolean bandera3= true;
                    do{
                        System.out.println("---------------Menu del chofer---------------");
                        System.out.println("1.Registrar servicios del dia");
                        System.out.println("2.Calcular ganancia del dia");
                        System.out.println("3.Historial de servicios");
                        System.out.println("x.Salir a menu principal");
                        System.out.println("----------------------------------------------");
                        String opcion3= teclado.next();
                        switch (opcion3){
                            case "1":
                                System.out.println("--Regristrar servicio--");
                                System.out.println("Fecha del dia: "+fecha);
                                System.out.println("Precio del servicio: ");
                                double costo = teclado.nextDouble();
                                Servicio servicio = new Servicio(costo);
                                servicios.add(servicio);
                                System.out.println("Servicio registrado!");
                                break;
                            case "2":
                                //sumar ganancias de un dia
                                System.out.println("---Ganancias del dia---");
                                double ingresoTotal=0.0;
                                for (Servicio servicio1 : servicios){
                                    ingresoTotal += servicio1.getCosto();
                                }
                                System.out.println("Ingreso total del dia: "+ ingresoTotal);
                                break;
                            case "3":
                                System.out.println("---Servicios del dia---");
                                if (servicios.isEmpty()) {
                                    System.out.println("No se han registrado servicios en este día.");
                                } else {
                                    System.out.println("fecha: "+fecha);
                                    for (Servicio servicio1 : servicios) {
                                        System.out.println("Servicio: "+"Costo: " + servicio1.getCosto());
                                        System.out.println("----------------------------------------------");
                                    }
                                }
                                break;
                            default:
                                System.out.println("Saliendo a menu principal..........");
                                bandera3= false;
                                break;
                        }
                    }while (bandera3);
                    break;
                default:
                    bandera=false;
                    System.out.println("----------Saliendo del programa-----------");
                    break;
            }
        }while(bandera);
    }
}
