/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import businesslayer.UserBusinessLogic;
import businesslayer.ValidationException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author fwu
 */
public class UserRegistrationServlet extends HttpServlet {
    
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
            request.getRequestDispatcher("/views/registration.jsp").forward(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            addUser(request, response);
            response.sendRedirect(request.getContextPath() + "/views/login.jsp");
        } catch (ValidationException ex) {
            Logger.getLogger(UserRegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ValidationException {
        UserBusinessLogic userBusinessLogic = new UserBusinessLogic();
        String userName = request.getParameter("name");
        String email = request.getParameter("email");
        String userPassword = request.getParameter("password");
        String userType = request.getParameter("type");
        String subscription = request.getParameter("subscription");
        
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(userPassword);
        user.setUserType(userType);
        user.setSubscription(subscription);
        
        userBusinessLogic.addUser(user);
    }
}
