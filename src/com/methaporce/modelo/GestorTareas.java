package com.methaporce.modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    List<Tarea> tareas = new ArrayList<>();

    public void addTarea(String nombre, String descripcion, int prioridad) {
        tareas.add(new Tarea(nombre, descripcion, prioridad));
    }

    public void completarTarea(String name) {
        for (Tarea tarea : tareas) {
            if (tarea.nombre.equals(name)) {
                tarea.estaCompletado = true;
                break;
            }
        }
    }

    public void eliminarTarea(String name) {
        tareas.removeIf(tarea -> tarea.nombre.equals(name));
    }

    public List<Tarea> obtenerTareasPendientes() {
        List<Tarea> tareasPendientes = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (!tarea.estaCompletado) {
                tareasPendientes.add(tarea);
            }
        }
        tareasPendientes.sort((task1, task2) -> task2.prioridad - task1.prioridad);
        return tareasPendientes;
    }
}
