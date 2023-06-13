/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Equipo {
    private int idEquipo;
    private int idProyecto;
    private String nombre;
    private LocalDate fechaCreacion;
    private boolean estado;
    
    public Equipo() {
    }
    
    public Equipo (int idEquipo, int idProyecto, String nombre, LocalDate fechaCreacion, boolean estado){
        this.idEquipo = idEquipo;
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }
    
    public Equipo(int idProyecto, String nombre, LocalDate fechaCreacion, boolean estado) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    public Equipo(String nombre, LocalDate fechaCreacion, boolean estado) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo{" + "idEquipo=" + idEquipo + ", idProyecto=" + idProyecto + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", estado=" + estado + '}';
    }
    
    
    
}
