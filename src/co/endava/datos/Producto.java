/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */
public class Producto {

    //Atributos de la clase Producto
    private int id;
    private String nombre;
    private double precio;
    
    public Producto() {
    }
    //Constructor de la clase Producto
    public Producto(int id, String nombre, double precio) {
        //Se inicializan atributos de la clase Producto
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Método para acceder al atributo id
    public int getId() {
        return id;
    }
    //Método para modificar el atributo id
    public void setId(int id) {
        this.id = id;
    }
    //Método para acceder al atributo nombre
    public String getNombre() {
        return nombre;
    }
    //Método para modificar el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Método para acceder al atributo precio
    public double getPrecio() {
        return precio;
    }
    //Método para modificar al atributo precio
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("No se permiten precios negativos");
        } else {
            this.precio = precio;
        }
    }
    //Método para acceder al atributo Descuento
    public double getDescuento(){
        return precio * 0.1d;
    }
    //Sobre escritura del método toString
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    }
}
