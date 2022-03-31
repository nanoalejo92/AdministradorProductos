/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;

/**
 *
 * @author cafajardo
 */

//Clase Comida que hereda de la clase Producto
public class Comida extends Producto {
    //Atributo fechaVencimiento del tipo LocalDate
    private LocalDate fechaVencimiento;
    //Constructor clase Comida. Inicializa los atributos
    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) {
        //Atributos que ya se inicializaron en la clase Producto
        super(id, nombre, precio);
        //Se inicializan atributos extra de la clase Comida
        this.fechaVencimiento = fechaVencimiento;
    }
    //Método para aceder al atributo FechaVencimiento del tipo LocalDate
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    //Método para modificar el atributo FechaVencimiento del tipo void
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    //Sobre escritura del método getDescuento
    @Override
    //Método para acceder al atributo Descuento
    public double getDescuento() {
        if (fechaVencimiento.equals(LocalDate.now())) {
            return super.getDescuento();
        } 
        else {
            return 0;
        }
    }
    //Sobre escritura del método toString
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    }
}
