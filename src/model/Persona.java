package model;

public abstract class Persona implements Registrable {
    protected String rut;
    protected String nombre;

    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() { return rut; }
    public String getNombre() { return nombre; }
}
