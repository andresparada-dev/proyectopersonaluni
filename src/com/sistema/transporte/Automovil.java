package com.sistema.transporte;

public class Automovil extends VehiculoTerrestre {

    private int capacidadPasajeros;

    public Automovil(String marca, int velocidadMaxima, int capacidadPasajeros) {
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
        return "Automóvil [Marca: " + marca + ", Pasajeros: " + capacidadPasajeros + "]";
    }

    @Override
    public void moverse() {
        System.out.println("El automóvil " + marca + " circula por la carretera y tiene capacidad para " + capacidadPasajeros + " pasajeros y viaja a " + velocidadMaxima + " km/h.");
    }
}
