package com.methaporce.vista;

import com.methaporce.modelo.GestorTareas;
import com.methaporce.modelo.Tarea;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestorTareas = new GestorTareas();

        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Completar tarea");
            System.out.println("3. Remover tarea");
            System.out.println("4. Mostrar tareas pendientes");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    String name = scanner.nextLine();
                    System.out.print("Descripción de la tarea: ");
                    String description = scanner.nextLine();
                    System.out.print("Prioridad de la tarea: ");
                    int priority = scanner.nextInt();
                    gestorTareas.addTarea(name, description, priority);
                    break;
                case 2:
                    System.out.print("Nombre de la tarea a completar: ");
                    String taskToComplete = scanner.nextLine();
                    gestorTareas.completarTarea(taskToComplete);
                    break;
                case 3:
                    System.out.print("Nombre de la tarea a remover: ");
                    String taskToRemove = scanner.nextLine();
                    gestorTareas.eliminarTarea(taskToRemove);
                    break;
                case 4:
                    List<Tarea> tareas = gestorTareas.obtenerTareasPendientes();
                    for (Tarea tarea : tareas) {
                        System.out.println("Nombre: " + tarea.nombre + ", Descripción: " + tarea.descripcion + ", Prioridad: " + tarea.prioridad);
                    }
                    break;
                case 0:
                    System.out.println("El programa se terminará ahora");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción desconocida. Por favor selecciona de nuevo.");
                    break;
            }
        }
    }
}
