/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import businesslayer.FoodBusinessLogic;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Food;

/**
 *
 * @author adawe
 */
//@WebServlet(name = "foodServlet", urlPatterns = {"/Food"})
public class UpdateFoodServlet extends HttpServlet {

    String foodId = null;
    Food food = null;
    FoodBusinessLogic foodBusinessLogic = null;
    Integer id= null;

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        foodBusinessLogic = new FoodBusinessLogic();
        foodId = request.getParameter("foodId");
        
        id = Integer.valueOf(foodId);
        
        try {
            food = foodBusinessLogic.getFoodById(id);
        } catch (SQLException ex) {
            log(ex.getMessage());
        }
        
        request.setAttribute("food", food);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/retailer_update_food.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            updateFood(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateFoodServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("Food");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Food updateFood(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        FoodBusinessLogic foodBusinessLogic = new FoodBusinessLogic();
//        Integer foodId = Integer.parseInt(request.getParameter("foodId"));

//        String foodName = request.getParameter("foodName");
//        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
//        String expireDate = request.getParameter("expireDate");
//        Double price = Double.parseDouble(request.getParameter("price"));
        foodBusinessLogic = new FoodBusinessLogic();
        foodId = request.getParameter("foodId");
        
        id = Integer.valueOf(foodId);
        try {
            food = foodBusinessLogic.getFoodById(id);
        } catch (SQLException ex) {
            log(ex.getMessage());
        }
        Double discount = Double.parseDouble(request.getParameter("discount"));
        Boolean donation = Boolean.parseBoolean(request.getParameter("donation"));
        Boolean sale = Boolean.parseBoolean(request.getParameter("sale"));

//        Food food = new Food();
//        food.setFoodID(foodId);
//        food.setFoodName(foodName);
//        food.setQuantity(quantity);
//        food.setExpireDate(expireDate);
//        food.setPrice(price);
        food.setDiscount(discount);
        food.setDonation(donation);
        food.setSale(sale);
        foodBusinessLogic.updateFood(Integer.parseInt(foodId), discount, donation, sale);
        return food;
    }
    
}
