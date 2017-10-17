package com.scolari.scolari.model;

/**
 * Created by zilikos on 15/10/17.
 */

public class ListaActividad {

    private String date;
    private String title;

    public ListaActividad(String date, String title) {
        this.date = date;
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }
}
