// Archivo: Automovil.java
package com.sistema.transporte;

public class Automovil extends VehiculoTerrestre {
    public Automovil(String marca, int velocidadMaxima) { super(marca, velocidadMaxima); }

    @Override
    public void moverse() {
        System.out.println("El automóvil " + marca + " circula por la carretera.");
    }
}