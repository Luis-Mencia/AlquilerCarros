/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquilercarros;

/**
 *
 * @author lumen
 */
public class Carro {

    private String placa;
    private String marca;
    private String modelo;
    private double precio;
    private boolean disponible;
    private int edad;

    public Carro(String placa, String marca, String modelo, double precio, boolean disponible, int edad) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.disponible = disponible;
        this.edad = edad;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public int getEdad() {
        return edad;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void alquilar() {
        if (disponible) {
            disponible = false;
            System.out.println("El Vehiculo " + modelo + " ha sido alquilado correctamente");

        } else {
            System.out.println("El Vehiculo " + modelo + " no se encuentra disponible ");
        }
    }
    
    public void devolver(){
        disponible = true;
        System.out.println("El Vehiculo " + modelo + "Ha sido desocupado,Ya se encuntra disponible para alquilar");
    }

    @Override
    public String toString() {
        return "--- Detalles Del Vehiculo---\n" +
                "Placa " + placa + "\n"+
                "Marca: " + marca + "\n"+
                "Modelo: " + modelo + "\n"+
                "Precio por dia: "+ precio+ "\n"+
                "Edad requerida:"+ edad + "\n"+
                "Disponible: "+ disponible + "\n"+
                "--------------------------------";        
    }
    
    

}
