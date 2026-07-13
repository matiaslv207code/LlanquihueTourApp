package model;

public class GuiaTuristico extends Persona {
    private String idioma;

    public GuiaTuristico(String rut, String nombre, String idioma) {
        super(rut, nombre);
        this.idioma = idioma;
    }

    @Override
    public String mostrarResumen() {
        return "[Guía] RUT: " + rut + " | Nombre: " + nombre + " | Idioma: " + idioma;
    }
}
