// Archivo: Vehiculo.java
package com.sistema.transporte;

public abstract class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método abstracto para polimorfismo
    public abstract void moverse();
}
