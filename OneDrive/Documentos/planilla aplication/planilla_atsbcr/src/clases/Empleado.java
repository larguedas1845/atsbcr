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
    private Date fechaNacimiento;
    private String Email;
    private String phone;
    private String address;
    private Integer nacional;
    private Integer sexo;
    private Integer estadoCivil;
    private String Puesto;
    
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNacional() {
        return nacional;
    }

    public void setNacional(Integer nacional) {
        this.nacional = nacional;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Integer estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }
    
    
    
}
