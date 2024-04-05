/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

/**
 * concrete class to implements the methods from interface.
 * @author fwu
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public void addUser(User user) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            // do not insert userID, it is generated by Database
            pstmt = con.prepareStatement(
                        "INSERT INTO Users (userName, email, userPassword, userType, subscription) "
                        + "VALUES(?, ?, ?, ?, ?)");
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getUserType());
            pstmt.setString(5, user.getSubscription());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public String getUserPasswordByEmail(String email) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String password = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                        "SELECT userPassword FROM Users WHERE email = ?");
            pstmt.setString(1, email);
            rs = pstmt.executeQuery();
            if (rs.next()) { // Check if there's a result
                password = rs.getString("userPassword");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return password;
    }

    
    
}
