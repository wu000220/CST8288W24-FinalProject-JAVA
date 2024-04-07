/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

//import com.mysql.cj.xdevapi.Schema.Validation;
//import businesslayer.Validation;

import dataaccesslayer.UserDAO;
import dataaccesslayer.UserDAOImpl;
import model.User;


/**
 *
 * @author fwu
 */
public class UserBusinessLogic {

    private UserDAO userDAO = null;
    private Validation validation = null;

    public UserBusinessLogic() {
        userDAO = new UserDAOImpl();
        validation = new Validation();
    }

    private void cleanUser(User user) {
        if (user.getUserName() != null) {
            user.setUserName(user.getUserName().trim());
        }
        if (user.getEmail() != null) {
            user.setEmail(user.getEmail().trim());
        }
        if (user.getPassword() != null) {
            user.setPassword(user.getPassword().trim());
        }
        if (user.getUserType() != null) {
            user.setUserType(user.getUserType().trim());
        }
        if (user.getSubscription() != null) {
            user.setSubscription(user.getSubscription().trim());
        }
    }
    
    public void addUser(User user) throws ValidationException{
        cleanUser(user);
        validation.validatePasswordImpl(user.getPassword());
        userDAO.addUser(user);
    }
    
    public String getUserPasswordByEmail(String email){
        return userDAO.getUserPasswordByEmail(email);
    }
    
    public String getUserTypeByEmail(String email){
        return userDAO.getUserTypeByEmail(email);
    }
    
    public String getSubscriptionByEmail(String email){
        return userDAO.getSubscriptionByEmail(email);
    }
}

