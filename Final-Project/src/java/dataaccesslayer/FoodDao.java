/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccesslayer;

import java.util.List;
import model.Food;

/**
 *
 * @author adawe
 */
public interface FoodDao {
    
    public List<Food> getAllFood();
    public List<Food> getAllSurplusFood();
    public List<Food> getAllDonationFood();
    public List<Food> getAllSaleFood();
    public Food getFoodById(Integer id);
    public void deleteFoodById(Integer id);
    public Food updateFood(Integer id, Double discount, Boolean donation, Boolean sale);
    public void addFood(Food food);
    
}
