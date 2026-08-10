// Archivo: Motocicleta.java
package com.sistema.transporte;

public class Motocicleta extends VehiculoTerrestre {
    public Motocicleta(String marca, int velocidadMaxima) { super(marca, velocidadMaxima); }

    @Override
    public void moverse() {
        System.out.println("La motocicleta " + marca + " circula por la carretera.");
    }
}
