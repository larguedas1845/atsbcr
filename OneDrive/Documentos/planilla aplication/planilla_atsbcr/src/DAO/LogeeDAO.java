
package DAO;

import clases.ClassLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author larguedas
 */
public class LogeeDAO {
    private PreparedStatement sentencia;
    private conexion con;
    private ClassLogin usuario;
    private String exa;
    String pass;
    String use;
    String nom;
    Integer rol;
    Integer Depa;
   
   
    
   public LogeeDAO(){
       con = new conexion();
       usuario = new ClassLogin();
   }

    public int logeo(ClassLogin log) {
        
        try {
            if (this.con.conectarse()){
                sentencia = con.getCon().prepareStatement("select * from inventario.users where idusers = ?");
                sentencia.setString(1, log.getUser());
                ResultSet datos = sentencia.executeQuery();

                while (datos.next()) {
                    pass = datos.getString(2);
                    use= datos.getString(1);
                    Depa= datos.getInt(3);
                    rol= datos.getInt(4);
                    
                }
                this.con.desconectarse();
                if (pass != null) {
                    if (pass.equals(log.getPass())) {
                        ClassLogin usuario = new ClassLogin();
                        this.usuario.setUser(use);
                        this.usuario.setPass(pass);
                        this.usuario.setDepa(Depa);
                        this.usuario.setRoll(rol);
                    return 0;/*si todo esta bien*/
                } else {
                    return 3;/*clave incorrecta*/
                }
                }else{
                    return 4;/*clave en null*/
                }
                

            } else {
                return 2; //no se conecto a BD
            }

        } catch (SQLException e) {
            exa= e.getMessage();
            return 1;
        }
    }    

    public String getExa() {
        return exa;
    }

    public void setExa(String exa) {
        this.exa = exa;
    }
    
}
