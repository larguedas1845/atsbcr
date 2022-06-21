/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author larguedas
 */
public class Empleado {
    private String nombre;
    private String apellido01;
    private String apellido02;
    private Integer depa;
    private Integer roll;
    private Integer tipoPlanilla;
    private Date fechaIngreso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido01() {
        return apellido01;
    }

    public void setApellido01(String apellido01) {
        this.apellido01 = apellido01;
    }

    public String getApellido02() {
        return apellido02;
    }

    public void setApellido02(String apellido02) {
        this.apellido02 = apellido02;
    }

    public Integer getDepa() {
        return depa;
    }

    public void setDepa(Integer depa) {
        this.depa = depa;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public Integer getTipoPlanilla() {
        return tipoPlanilla;
    }

    public void setTipoPlanilla(Integer tipoPlanilla) {
        this.tipoPlanilla = tipoPlanilla;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
    
}
