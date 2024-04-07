/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import businesslayer.FoodBusinessLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Food;

/**
 *
 * @author adawe
 */
//@WebServlet(name = "SurplusFoodServlet", urlPatterns = {"/SurplusFoodServlet"})
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


/**
 *
 * @author adawe
 */
//@WebServlet(name = "foodServlet", urlPatterns = {"/Food"})
public class DonationFoodServlet extends HttpServlet {

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
        FoodBusinessLogic foodBusinessLogic = new FoodBusinessLogic();
        List<Food> foods = null;

        try {
            foods = foodBusinessLogic.getAllDonationFood();
        } catch (SQLException ex) {
            log(ex.getMessage());
        }

        request.setAttribute("foods", foods);

        RequestDispatcher dispatcher = request.getRequestDispatcher("views/donation_foodList.jsp");
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
        deleteFood(request, response);
        doGet(request, response);
        response.sendRedirect("DonationFood");

        
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

    private void deleteFood(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    FoodBusinessLogic foodBusinessLogic = new FoodBusinessLogic();
    Integer foodId = Integer.parseInt(request.getParameter("foodId"));

    try {
        foodBusinessLogic.deleteFoodById(foodId);
    } catch (SQLException ex) {
        log(ex.getMessage());
    }

//    response.sendRedirect(request.getContextPath() + "/DonationFood");
}

}