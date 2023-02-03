/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.ClassLogin;
import clases.Empleado;
import com.mysql.cj.protocol.Resultset;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author larguedas
 */
public class EmpleadosDAO {

    private PreparedStatement sentencia;
    private conexion con;
    public ClassLogin Usuario;
    public String Exa;
    public Empleado empleado;

    public EmpleadosDAO() {
        con = new conexion();
        Usuario = new ClassLogin();
    }

    public int Ingreso(Empleado empleado) {
        try{
            if(this.con.conectarse(Usuario)){
                sentencia= con.getCon().prepareStatement("insert intro inventrario.empleados values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                sentencia.setInt(1, empleado.getCedula());
                sentencia.setString(2, empleado.getNombre());
                sentencia.setString(3, empleado.getPhone());
                sentencia.setString(4, empleado.getAddress());
                sentencia.setString(6,empleado.getApellido01());
                sentencia.setString(7,empleado.getApellido02());
                sentencia.setString(8, empleado.getEmail());
                sentencia.setDate(9, (Date) empleado.getFechaNacimiento());
                sentencia.setInt(10, empleado.getSexo());
                sentencia.setInt(11, empleado.getNacional());
                sentencia.setInt(12, empleado.getEstadoCivil());
                sentencia.setString(13, empleado.getPuesto());
                sentencia.setInt(14, empleado.getTipoPlanilla());
                sentencia.setDate(15, (Date) empleado.getFechaIngreso());
                sentencia.setInt(16, empleado.getDepa());
                
                this.sentencia.executeUpdate();
                this.con.desconectarse();
                return 0; //todo funciono
            }else{
                return 1; //no hubo conexion
            }
        }catch (SQLException ex){
            if (ex.getSQLState().startsWith("23")) {
                return 3;//llave dupilcada
            } else {
                return 2; // retorna 2 cuando cae al catch
            }
            
        }
    }

    public int consulta(Empleado empleado) {
        try {
            if (this.con.conectarse(Usuario)) {
                sentencia = con.getCon().prepareStatement("select * from inventario.empleados where idempleados= ?");
                sentencia.setInt(1, empleado.getCedula());
                ResultSet datos = sentencia.executeQuery();
                empleado = new Empleado();
                while (datos.next()) {
                    empleado.setNombre(datos.getString(2));
                    empleado.setPhone(datos.getString(3));
                    empleado.setAddress(datos.getString(4));

                }

            } else {
                Exa = "No Conexion a BD";
                return 1;//no conexion.
            }

        } catch (Exception e) {
        }
        return 0;
    }

    public Empleado dataEmp(Empleado empleado) {
        try {
            if (this.con.conectarse(Usuario)) {
                sentencia = con.getCon().prepareStatement("select * from inventario.empleados where idempleados= ?");
                sentencia.setInt(1, empleado.getCedula());
                ResultSet datos = sentencia.executeQuery();
                empleado = new Empleado();
                while (datos.next()) {
                    empleado.setNombre(datos.getString(2));
                    empleado.setPhone(datos.getString(3));
                    empleado.setAddress(datos.getString(4));

                }

            } else {
                Exa = "No Conexion a BD";
                return this.empleado;//no conexion.
            }

        } catch (Exception e) {
        }
        return empleado;
    }

    public String getExa() {
        return Exa;
    }

    public void setExa(String Exa) {
        this.Exa = Exa;
    }

    public PreparedStatement getSentencia() {
        return sentencia;
    }

    public void setSentencia(PreparedStatement sentencia) {
        this.sentencia = sentencia;
    }

    public conexion getCon() {
        return con;
    }

    public void setCon(conexion con) {
        this.con = con;
    }

    public ClassLogin getUsuario() {
        return Usuario;
    }

    public void setUsuario(ClassLogin Usuario) {
        this.Usuario = Usuario;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
