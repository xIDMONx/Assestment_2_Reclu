package com.methaporce.modelo;

public class Tarea {

    public String nombre;
    public String descripcion;
    public int prioridad;
    public boolean estaCompletado;

    public Tarea(String nombre, String descripcion, int prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estaCompletado = false;
    }
}
