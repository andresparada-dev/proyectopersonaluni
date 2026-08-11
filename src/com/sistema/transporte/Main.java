// Archivo: Main.java
package com.sistema.transporte;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista de vehículos usando el tipo base
        Vehiculo[] flota = {
                new Automovil("Toyota", 200, 5),
                new Avion("Boeing", 900, 500),
                new Submarino("Seawolf", 40, 300)
        };

        // Ejecución polimórfica
        for (Vehiculo v : flota) {
            v.moverse();
        }
    }
}
