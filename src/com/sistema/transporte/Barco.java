// Archivo: Barco.java
package com.sistema.transporte;

public class Barco extends VehiculoTerrestre {
    public Barco(String marca, int velocidadMaxima) { super(marca, velocidadMaxima); }

    @Override
    public void moverse() {
        System.out.println("El Barco " + marca + " anda por el mar.");
    }
}

