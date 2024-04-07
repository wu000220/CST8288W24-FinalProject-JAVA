/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccesslayer;

import model.User;

/**
 * methods to manipulate user table.
 * @author fwu
 */
public interface UserDAO {
    
    public void addUser(User user);
    
    public String getUserPasswordByEmail(String email);
    
    public String getUserTypeByEmail(String email);
    
    public String getSubscriptionByEmail(String email);
}
