
package BO;

import DAO.LogeeDAO;
import clases.ClassLogin;

/**
 *
 * @author larguedas
 */
public class LoginBO {
    private LogeeDAO logeodao;
    
    public LoginBO(){
        logeodao = new LogeeDAO();
    }

    public int datosusuaio(ClassLogin log) {
        return this.logeodao.logeo(log);
    }
    
}
