/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquilercarros;

import java.util.Scanner;

/**
 *
 * @author lumen
 */
public class AlquilerCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO code application logic here
        Carro carro1 = new Carro("HND3423", "JEEP", "RUBICON", 80.0, true, 21);
        Carro carro2 = new Carro("HND7843", "RAM", "T-REX", 100.0, true, 21);
        Carro carro3 = new Carro("HND1256", "TOYOTA", "CORROLLA", 45.0, true, 18);
        Carro carro4 = new Carro("HND5678", "HONDA", "CIVIC", 50.0, true, 18);
        Carro carro5 = new Carro("HND1277", "FORD", "F-150", 85.0, true, 21);
        boolean acc = true;
        System.out.println("RENTACAR LM");
        System.out.println("REGISTRO CLIENTE");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("ID: ");
        String celula = sc.nextLine();
        System.out.print("Edad:");
        int edad = sc.nextInt();
        System.out.println("Presupuesto Disponible: ");
        double dinero = sc.nextDouble();
        sc.nextLine();
        Cliente cliente = new Cliente(nombre, apellido, celula, edad, dinero);

        while (acc) {
            System.out.println("\nRENTACAR LM ");
            System.out.println("1. ver catalogo de autos");
            System.out.println("2. Alquilar un vehiculo");
            System.out.println("3. devolver vehiculo");
            System.out.println("4. salir");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("CATALOGO DE VEHICULOS DISPONIBLES");
                    System.out.println("1.- " + carro1);
                    System.out.println("2.- " + carro2);
                    System.out.println("3.- " + carro3);
                    System.out.println("4.- " + carro4);
                    System.out.println("5.- " + carro5);
                    break;

                case 2:
                    System.out.println("CATALOGO DE VEHICULOS DISPONIBLES");
                    System.out.println("1.- " + carro1);
                    System.out.println("2.- " + carro2);
                    System.out.println("3.- " + carro3);
                    System.out.println("4.- " + carro4);
                    System.out.println("5.- " + carro5);

                    System.out.println("\nSeleccione el vehiculo a alquilar: ");
                    int op = sc.nextInt();
                    Carro vehiculoSelec = null;

                    switch (op) {
                        case 1:
                            vehiculoSelec = carro1;
                            break;
                        case 2:
                            vehiculoSelec = carro2;
                            break;
                        case 3:
                            vehiculoSelec = carro3;
                            break;
                        case 4:
                            vehiculoSelec = carro4;
                            break;
                        case 5:
                            vehiculoSelec = carro5;
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");

                    }
                    if (vehiculoSelec != null) {
                        cliente.alquilar(vehiculoSelec);

                    }
                    break;

                case 3:
                    if (cliente.VehiculoAlquilado() != null) {
                        System.out.println("Vehiculo Alquilado");
                        System.out.println(cliente.VehiculoAlquilado());
                        System.out.println("Desea devolver este vehiculo[1.Si/2.No]");
                        int devolop = sc.nextInt();
                        if (devolop == 1) {
                            cliente.devVehiculo();
                            System.out.println("El vehiculo ha sido devuelto correctamente");
                            
                        }else{
                            System.out.println("No posee vehiculos alquilados");
                        }
                    }
                    break;
                case 4:
                    acc = false;
                    System.out.println("Gracias por usa nuestro servicio");

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        }

    }

}
