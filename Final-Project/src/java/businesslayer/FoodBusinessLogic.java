/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

import dataaccesslayer.FoodDAO;
import dataaccesslayer.FoodDAOImpl;

/**
 *
 * @author fwu
 */
public class FoodBusinessLogic {
    
    private FoodDAO foodDAO = null;
    
    public FoodBusinessLogic(){
        foodDAO = new FoodDAOImpl();
    }
}  
