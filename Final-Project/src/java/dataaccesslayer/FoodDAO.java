/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccesslayer;

import model.Food;

/**
 * methods to manipulate food table.
 * @author fwu
 */
public interface FoodDAO {
    
    public void addFood(Food food);
    
    public void updateQuantity(Food food);
    
    public void setExpiration(Food food);
    
}
