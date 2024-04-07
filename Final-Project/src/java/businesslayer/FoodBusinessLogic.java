/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;


import dataaccesslayer.FoodDaoImpl;
import java.sql.SQLException;
import java.util.List;
import model.Food;


/**
 *
 * @author fwu
 */
public class FoodBusinessLogic {
    private FoodDaoImpl foodDao = null;

    public FoodBusinessLogic() {
        foodDao = new FoodDaoImpl();
    }

    public List<Food> getAllFood() throws SQLException {
        return foodDao.getAllFood();
    }

    public Food getFoodById(Integer id) throws SQLException {
        return foodDao.getFoodById(id);
    }

    public void addFood(Food food) {
        foodDao.addFood(food);
    }
    
    public Food updateFood(Integer id, Double discount, Boolean donation, Boolean sale) throws SQLException{
        return foodDao.updateFood(id, discount, donation, sale);
    }
    
    public List<Food> getAllSurplusFood() throws SQLException {
        return foodDao.getAllSurplusFood();
    }
    
    public List<Food> getAllDonationFood() throws SQLException {
        return foodDao.getAllDonationFood();
    }
    
    public List<Food> getAllSaleFood() throws SQLException {
        return foodDao.getAllSaleFood();
    }
    

    public void deleteFoodById(Integer id) throws SQLException {
         foodDao.deleteFoodById(id);
    }


}  

