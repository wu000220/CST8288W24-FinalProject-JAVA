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
import javax.servlet.http.HttpSession;

/**
 *
 * @author fwu
 */
public class UserLoginServlet extends HttpServlet {

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
        request.getRequestDispatcher("/views/login.jsp").forward(request, response);
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
            verifyLogin(request, response);
        } catch (ValidationException ex) {
            Logger.getLogger(UserLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
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

    private void verifyLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ValidationException {
        UserBusinessLogic userBusinessLogic = new UserBusinessLogic();

        // retrieve data from website.
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // retrive data from database.
        String storedPassword = userBusinessLogic.getUserPasswordByEmail(email);
        String userType = userBusinessLogic.getUserTypeByEmail(email);
        String subscription = userBusinessLogic.getSubscriptionByEmail(email);

        // Store subscription status in session
        HttpSession session = request.getSession();
        session.setAttribute("subscription", subscription);

        if (storedPassword != null && storedPassword.equals(password)) {
            switch (userType) {
                case "retailer":
                    response.sendRedirect(request.getContextPath() + "/views/retailer_index.jsp");
                    break;
                case "customer":
                    response.sendRedirect(request.getContextPath() + "/SaleFood");
                    break;
                case "charitable_organization":
                    response.sendRedirect(request.getContextPath() + "/DonationFood");
                    break;
                default:
                    break;
            }
        } else {
            response.sendRedirect(request.getContextPath() + "/views/registration.jsp");
        }
    }
}
