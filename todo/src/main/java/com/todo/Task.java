package com.todo;

import java.util.Date;

public class Task {

    private String nombre;
    private String descpricion;
    private Date fechaCreacion;
    private Date fechaLimite;
    private String prioridad;

    public Task(String nombre, String descpricion, Date fechaCreacion, Date fechaLimite,  String prioridad) {
        this.descpricion = descpricion;
        this.fechaCreacion = fechaCreacion;
        this.fechaLimite = fechaLimite;
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescpricion() {
        return descpricion;
    }

    public void setDescpricion(String descpricion) {
        this.descpricion = descpricion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    
    
}
