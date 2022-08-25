package DAO;

import clases.ClassLogin;
import static java.lang.Class.forName;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.SQLException;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;

public class conexion {

    private Connection con;

    public conexion() {
        this.con = null;
        ;

    }

    public boolean desconectarse() {
        try {
            this.con.close();
            return true;
        } catch (SQLException ex) {
            getLogger(conexion.class.getName()).log(SEVERE, null, ex);
            return false;
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    boolean conectarse(ClassLogin log) {
        try {
            forName("com.mysql.cj.jdbc.Driver");
            String servidor = "jdbc:mysql://192.168.100.69:3306/inventario?useSSL=false&serverTimezone=UTC";
            this.con = (Connection) getConnection(servidor, log.getUser(), log.getPass());
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

}
