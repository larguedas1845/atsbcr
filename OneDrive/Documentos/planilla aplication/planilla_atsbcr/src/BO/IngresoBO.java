/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.IngresoDAO;
import clases.Empleado;

/**
 *
 * @author larguedas
 */
public class IngresoBO {
    private IngresoDAO ingresodao;
    
    public IngresoBO(){
        ingresodao = new IngresoDAO();
    }

    public int agregar(Empleado empl) {
        return this.ingresodao.agregar(empl);
    }
    
}
