
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conexion {
    private Connection conn;
    
    public boolean conectarse(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/inventario?useSSL=false&serverTimezone=UTC";
            String usuario ="root";
            String password= "root";
            try {
                this.conn= (Connection)DriverManager.getConnection(url, usuario, password);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
        
    }
    
    public boolean desconectarse(){
        try{
            this.conn.close();
            return true;
            
        }catch (SQLException sqle){
            
            return false;
        }
    }
    

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    
}
