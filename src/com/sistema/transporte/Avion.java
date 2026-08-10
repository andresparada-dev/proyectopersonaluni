// Archivo: Avion.java
package com.sistema.transporte;

public class Avion extends VehiculoTerrestre {
    public Avion(String marca, int velocidadMaxima) { super(marca, velocidadMaxima); }

    @Override
    public void moverse() {
        System.out.println("El Avion " + marca + " viaja por los cielos.");
    }
}
