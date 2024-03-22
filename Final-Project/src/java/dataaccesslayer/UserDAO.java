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
    
    // can be bonus
    public void updateUser(User user);
}
