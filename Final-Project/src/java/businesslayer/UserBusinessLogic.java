/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

import dataaccesslayer.UserDAO;
import dataaccesslayer.UserDAOImpl;

/**
 *
 * @author fwu
 */
public class UserBusinessLogic {
    
    private UserDAO userDAO = null;
    
    public UserBusinessLogic(){
        userDAO = new UserDAOImpl();
    }
}
