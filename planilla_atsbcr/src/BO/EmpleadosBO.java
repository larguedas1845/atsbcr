/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.EmpleadosDAO;
import clases.Empleado;

/**
 *
 * @author larguedas
 */


public class EmpleadosBO {
    private EmpleadosDAO empleadosdao;
    
    public EmpleadosBO(){
        empleadosdao= new EmpleadosDAO();
    }

    public int ingreso(Empleado empleado) {
        return this.empleadosdao.Ingreso(empleado);
    }



    public int consulta(Empleado empleado) {
        return this.empleadosdao.consulta(empleado);
    }

    public Empleado data(Empleado empleado) {
        return this.empleadosdao.dataEmp(empleado);
    }

    
    
    
    
}
