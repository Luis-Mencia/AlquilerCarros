/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilercarros;

/**
 *
 * @author lumen
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String celula;
    private int edad;
    private Carro VehiculoAlquilado;
    private double dinero;

    public Cliente(String nombre, String apellido, String celula, int edad, double dinero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celula = celula;
        this.edad = edad;
        this.VehiculoAlquilado = null;
        this.dinero = dinero;
    }
    
    
    public void alquilar(Carro Carro){
        if (!Carro.isDisponible()){
            System.out.println("El Vehiculo no esta se encuentra disponible para alquilar");
            return;
        }
        if (edad < Carro.getEdad()) {
            System.out.println("No se puede alquilar este vehiculo, Edad minima requeriada: " + Carro.getEdad());
            return;
            
        }
        if (dinero < Carro.getPrecio()) {
            System.out.println("No tiene suficientes fondos para alquilar este vehiculo");
            return;
       
        }
        this.dinero -= Carro.getPrecio();
        this.VehiculoAlquilado = Carro;
        Carro.alquilar();
        System.out.println("Dinero restante: " + dinero);
    }
    public void devVehiculo(){
        if (VehiculoAlquilado != null) {
            VehiculoAlquilado.devolver();
            VehiculoAlquilado = null;
            
        }else{
            System.out.println("No posee vehiculos alquilados");
        }
    }
    
    
    
}
