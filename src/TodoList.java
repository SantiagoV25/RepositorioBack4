import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public static List<String[]> listaDeTareas = new ArrayList<>();

    public static void agregarTarea(String descripcionTarea) {
        String[] tarea = new String[3];
        tarea[0] = descripcionTarea;
        tarea[1] = String.valueOf(false);
        tarea[2] = String.valueOf(0);
        listaDeTareas.add(tarea);
    }

    public static void completarTarea(int i, int min) {
        String[] tarea = listaDeTareas.get(i);
        tarea[1] = String.valueOf(true);
        tarea[2] = String.valueOf(min);
    }

    public static String listarTareasPendientes() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++) {
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]);
            if (!estaTareaCompleta) {
                listaTareas = listaTareas + i + " - " + tarea[0] + " (" + tarea[2] + ")" + "\n";
            }
        }
        return listaTareas;
    }

    public static String tareasCompletas() {
        String listaTareasCompl = "";

        for (int i = 0; i < listaDeTareas.size(); i++) {
            String[] tarea = listaDeTareas.get(i);
            boolean estaTareaCompleta = Boolean.parseBoolean(tarea[1]);
            if (estaTareaCompleta) {
                listaTareasCompl = listaTareasCompl + i + " - " + tarea[0] + " (" + tarea[2] + ")" + " \n";
            }
        }
        return listaTareasCompl;
    }

    public static String listarTareas() {
        String listaTareas = "";

        for (int i = 0; i < listaDeTareas.size(); i++) {
            String[] tarea = listaDeTareas.get(i);
            listaTareas = listaTareas + i + " - " + tarea[0] + " (" + tarea[2] + ")" + " \n";
        }
        return listaTareas;
    }

    public static boolean eliminarTarea(int i) {
        if (i >= 0 && i < listaDeTareas.size()) {
            listaDeTareas.remove(i);
            return true;
        } else {
            return false;
        }
    }

    public static void Actualizar(int i, String actualizarDescripcion) {
        String[] tarea = listaDeTareas.get(i);
        tarea[0] = actualizarDescripcion;
    }

    public static String detalleTarea(int i) {
        String detalle = "";
        String[] tarea = listaDeTareas.get(i);
        detalle = detalle + i + " - " + tarea[0] + " (" + tarea[2] + ")" + "\n";
        return detalle;
    }
}