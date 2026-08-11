package com.sistema.transporte;

public class Submarino extends VehiculoTerrestre {

    private int capacidadPasajeros;

    public Submarino(String marca, int velocidadMaxima, int capacidadPasajeros) {
        super(marca, velocidadMaxima);
        setCapacidadPasajeros(capacidadPasajeros);
    }

    public int getCapacidadPasajeros() {
        return this.capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidad) {
        if (capacidad >= 0) {
            this.capacidadPasajeros = capacidad;
        } else {
            System.out.println("Error: Pasajeros negativos. Se asigna 0.");
            this.capacidadPasajeros = 0;
        }
    }

    @Override
    public String toString() {
        return "Submarino [Marca: " + marca + ", Pasajeros: " + capacidadPasajeros + "]";
    }

    @Override
    public void moverse() {
        System.out.println("El Submarino " + marca + " anda por el mar Caribe y tiene capacidad para " + capacidadPasajeros + " pasajeros y viaja a " + velocidadMaxima + " km/h.");
    }
}
