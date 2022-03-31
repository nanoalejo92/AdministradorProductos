/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalTime;

/**
 *
 * @author cafajardo
 */
//Clase Bebida que hereda de la clase Producto
public class Bebida extends Producto {
    //Constructor clase Bebida. Inicializa los atributos
    public Bebida(int id, String nombre, double precio){
        //Atributos que ya se inicializaron en la clase Producto
        super(id, nombre, precio);
    }

    //Sobre escritura del método getDescuento
    @Override
    //Método para acceder al atributo Descuento
    public double getDescuento() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(17, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            return this.getPrecio() * 0.2d;
        } else {
            return 0;
        }
    }
}
