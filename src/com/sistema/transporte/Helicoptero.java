// Archivo: Helicoptero.java
package com.sistema.transporte;

public class Helicoptero extends VehiculoTerrestre {
    public Helicoptero(String marca, int velocidadMaxima) { super(marca, velocidadMaxima); }

    @Override
    public void moverse() {
        System.out.println("El Helicoptero " + marca + " viaja por el Pacífico");
    }
}
