package model;

public class Vehiculo implements Registrable {
    private String patente;
    private int capacidad;

    public Vehiculo(String patente, int capacidad) {
        this.patente = patente;
        this.capacidad = capacidad;
    }

    @Override
    public String mostrarResumen() {
        return "[Vehículo] Patente: " + patente + " | Capacidad: " + capacidad + " pasajeros.";
    }
}