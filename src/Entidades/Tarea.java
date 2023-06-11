/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author H
 */
public class Tarea {
    private int idTarea;
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaCierre;
    private boolean estado;
    private int idMiembroEq;
    
     public Tarea() {
    }

    public Tarea(String nombre, LocalDate fechaCierre, boolean estado, int idMiembroEq) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
        this.fechaCierre = fechaCierre;
        this.estado = estado;
        this.idMiembroEq = idMiembroEq;
    }

    public Tarea(int idTarea, String nombre, LocalDate fechaCreacion, LocalDate fechaCierre, boolean estado, int idMiembroEq) {
        this.idTarea = idTarea;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
        this.idMiembroEq = idMiembroEq;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
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

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdMiembroEq() {
        return idMiembroEq;
    }

    public void setIdMiembroEq(int idMiembroEq) {
        this.idMiembroEq = idMiembroEq;
    }

   
    
    
}
