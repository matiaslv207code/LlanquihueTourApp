package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import javax.swing.JOptionPane;

public class MainApp {
    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        String[] opciones = {"Registrar Guía", "Registrar Vehículo", "Mostrar Todo", "Salir"};

        boolean continuar = true;

        while (continuar) {
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción para la Agencia Llanquihue Tour:",
                    "Sistema de Gestión - Llanquihue Tour",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (seleccion) {
                case 0: // Registrar Guía [cite: 44]
                    String rutG = JOptionPane.showInputDialog("Ingrese RUT del Guía:");
                    String nombreG = JOptionPane.showInputDialog("Ingrese Nombre del Guía:");
                    String idioma = JOptionPane.showInputDialog("Ingrese Idioma principal:");

                    if(rutG != null && nombreG != null && idioma != null) {
                        gestor.agregarEntidad(new GuiaTuristico(rutG, nombreG, idioma));
                        JOptionPane.showMessageDialog(null, "¡Guía registrado con éxito!");
                    }
                    break;

                case 1: // Registrar Vehículo [cite: 44]
                    String patente = JOptionPane.showInputDialog("Ingrese Patente del Vehículo:");
                    String capStr = JOptionPane.showInputDialog("Ingrese Capacidad de pasajeros:");

                    if(patente != null && capStr != null) {
                        try {
                            int capacidad = Integer.parseInt(capStr);
                            gestor.agregarEntidad(new Vehiculo(patente, capacidad));
                            JOptionPane.showMessageDialog(null, "¡Vehículo registrado con éxito!");
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Error: La capacidad debe ser un número entero.");
                        }
                    }
                    break;

                case 2: // Mostrar Todo [cite: 45]
                    String reporte = gestor.obtenerReporteTodo();
                    JOptionPane.showMessageDialog(null, reporte, "Listado de Recursos", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema de la agencia.");
                    break;
            }
        }
    }
}