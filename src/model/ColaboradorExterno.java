package model;

public class ColaboradorExterno extends Persona {
    private String empresaProveedora;

    public ColaboradorExterno(String rut, String nombre, String empresaProveedora) {
        super(rut, nombre);
        this.empresaProveedora = empresaProveedora;
    }

    @Override
    public String mostrarResumen() {
        return "[Colaborador] RUT: " + rut + " | Nombre: " + nombre + " | Empresa: " + empresaProveedora;
    }
}
