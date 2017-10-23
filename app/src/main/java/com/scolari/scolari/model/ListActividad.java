package com.scolari.scolari.model;

import java.util.PriorityQueue;

/**
 * Created by zilikos on 23/10/17.
 */

public class ListActividad {

    private String titulo;
    private String Descripcion;
    private Boolean hecho;

    public ListActividad(String titulo, String descripcion, Boolean hecho) {
        this.titulo = titulo;
        Descripcion = descripcion;
        this.hecho = hecho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Boolean getHecho() {
        return hecho;
    }

    public void setHecho(Boolean hecho) {
        this.hecho = hecho;
    }
}
