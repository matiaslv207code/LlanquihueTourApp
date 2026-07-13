package data;

import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import java.util.ArrayList;

public class GestorEntidades {
    private ArrayList<Registrable> listaEntidades; // Colección genérica [cite: 38]

    public GestorEntidades() {
        this.listaEntidades = new ArrayList<>();
    }

    public void agregarEntidad(Registrable entidad) {
        listaEntidades.add(entidad);
    }

    public String obtenerReporteTodo() {
        if (listaEntidades.isEmpty()) {
            return "No hay entidades registradas.";
        }

        StringBuilder reporte = new StringBuilder("--- LISTADO DE ENTIDADES REGISTRADAS ---\n\n");

        for (Registrable r : listaEntidades) { // Bucle for-each [cite: 40]
            // Llamada polimórfica estándar
            reporte.append(r.mostrarResumen()).append("\n");

            // Uso de instanceof para lógica diferenciada según el tipo [cite: 41]
            if (r instanceof GuiaTuristico) {
                reporte.append("   -> Nota: Verificar vigencia de credencial de turismo.\n");
            } else if (r instanceof Vehiculo) {
                reporte.append("   -> Nota: Revisar calendario de mantención técnica obligatoria.\n");
            }
            reporte.append("--------------------------------------------------\n");
        }

        return reporte.toString();
    }
}