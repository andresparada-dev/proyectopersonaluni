// Archivo: Submarino.java
package com.sistema.transporte;

public class Submarino extends VehiculoTerrestre {
    public Submarino(String marca, int velocidadMaxima) { super(marca, velocidadMaxima); }

    @Override
    public void moverse() {
        System.out.println("El Submarino " + marca + " anda por el mar Caribe.");
    }
}