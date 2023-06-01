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
public class Composicion {
    private int idMiembroEq;
    private LocalDate fechaIncorporacion;
    private int idEquipo;
    private int idMiembro;

    public Composicion(LocalDate fechaIncorporacion, int idEquipo, int idMiembro) {
        this.fechaIncorporacion = fechaIncorporacion;
        this.idEquipo = idEquipo;
        this.idMiembro = idMiembro;
    }

    public Composicion(int idMiembroEq, LocalDate fechaIncorporacion, int idEquipo, int idMiembro) {
        this.idMiembroEq = idMiembroEq;
        this.fechaIncorporacion = fechaIncorporacion;
        this.idEquipo = idEquipo;
        this.idMiembro = idMiembro;
    }

    public int getIdMiembroEq() {
        return idMiembroEq;
    }

    public void setIdMiembroEq(int idMiembroEq) {
        this.idMiembroEq = idMiembroEq;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(int idMiembro) {
        this.idMiembro = idMiembro;
    }
    
    
}
