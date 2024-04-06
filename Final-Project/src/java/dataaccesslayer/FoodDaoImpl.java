/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Food;

/**
 *
 * @author adawe
 */
public class FoodDaoImpl {

    public FoodDaoImpl() {
    }

    public List<Food> getAllFood() throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Food> foods = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "SELECT foodID, foodName, quantity, expireDate, price, discount, donation, sale FROM Food ORDER BY foodID");
            rs = pstmt.executeQuery();
            foods = new ArrayList<Food>();
            while (rs.next()) {
                Food food = new Food();
                food.setFoodID(new Integer(rs.getInt("foodID")));
                food.setFoodName(rs.getString("foodName"));
                food.setQuantity(rs.getInt("quantity"));
                food.setExpireDate(rs.getString("expireDate"));
                food.setPrice(rs.getDouble("price"));
                food.setDiscount(rs.getDouble("discount"));
                food.setDonation(rs.getBoolean("donation"));
                food.setSale(rs.getBoolean("sale"));
                foods.add(food);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

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
        return foods;
    }
    
    
        public List<Food> getAllSurplusFood() throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Food> foods = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "SELECT foodID, foodName, quantity, expireDate, price, discount, donation, sale FROM Food WHERE donation = true OR sale = true");
            rs = pstmt.executeQuery();
            foods = new ArrayList<Food>();
            while (rs.next()) {
                Food food = new Food();
                food.setFoodID(new Integer(rs.getInt("foodID")));
                food.setFoodName(rs.getString("foodName"));
                food.setQuantity(rs.getInt("quantity"));
                food.setExpireDate(rs.getString("expireDate"));
                food.setPrice(rs.getDouble("price"));
                food.setDiscount(rs.getDouble("discount"));
                food.setDonation(rs.getBoolean("donation"));
                food.setSale(rs.getBoolean("sale"));
                foods.add(food);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

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
        return foods;
    }
        
        
     public List<Food> getAllDonationFood() throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Food> foods = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "SELECT foodID, foodName, quantity, expireDate, price, discount, donation, sale FROM Food WHERE donation = true");
            rs = pstmt.executeQuery();
            foods = new ArrayList<Food>();
            while (rs.next()) {
                Food food = new Food();
                food.setFoodID(new Integer(rs.getInt("foodID")));
                food.setFoodName(rs.getString("foodName"));
                food.setQuantity(rs.getInt("quantity"));
                food.setExpireDate(rs.getString("expireDate"));
                food.setPrice(rs.getDouble("price"));
                food.setDiscount(rs.getDouble("discount"));
                food.setDonation(rs.getBoolean("donation"));
                food.setSale(rs.getBoolean("sale"));
                foods.add(food);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

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
        return foods;
    }
     
     
     public List<Food> getAllSaleFood() throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Food> foods = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "SELECT foodID, foodName, quantity, expireDate, price, discount, donation, sale FROM Food WHERE sale = true");
            rs = pstmt.executeQuery();
            foods = new ArrayList<Food>();
            while (rs.next()) {
                Food food = new Food();
                food.setFoodID(new Integer(rs.getInt("foodID")));
                food.setFoodName(rs.getString("foodName"));
                food.setQuantity(rs.getInt("quantity"));
                food.setExpireDate(rs.getString("expireDate"));
                food.setPrice(rs.getDouble("price"));
                food.setDiscount(rs.getDouble("discount"));
                food.setDonation(rs.getBoolean("donation"));
                food.setSale(rs.getBoolean("sale"));
                foods.add(food);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

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
        return foods;
    }

    public Food getFoodById(Integer id) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Food food = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "SELECT foodName, quantity, expireDate, price, discount, donation, sale FROM Food where foodID = ?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                food = new Food();
                food.setFoodID(id);
                food.setFoodName(rs.getString("foodName"));
                food.setQuantity(rs.getInt("quantity"));
                food.setExpireDate(rs.getString("expireDate"));
                food.setPrice(rs.getDouble("price"));
                food.setDiscount(rs.getDouble("discount"));
                food.setDonation(rs.getBoolean("donation"));
                food.setSale(rs.getBoolean("sale"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

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
        return food;
    }
    
    public void deleteFoodById(Integer id) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Food food = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "DELETE FROM Food where foodId = ?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

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
//        return food;
    }

    public Food updateFood(Integer id, Double discount, Boolean donation, Boolean sale) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Food food = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement(
                    "UPDATE Food SET discount = ?, donation = ?, sale = ? WHERE foodID = ?");
            pstmt.setDouble(1, discount);
            pstmt.setBoolean(2, donation);
            pstmt.setBoolean(3, sale);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

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
        return food;
    }

    public void addFood(Food food) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            // do not insert AuthorID, it is generated by Database
            pstmt = con.prepareStatement("INSERT INTO Food (foodName, quantity, expireDate, price) VALUES(?,?,?,?)");
//                 ("INSERT INTO Food (foodName, quantity, expireDate, price, discount, donation, sale) VALUES(?,?,?,?,?,?,?)");   
            pstmt.setString(1, food.getFoodName());
            pstmt.setInt(2, food.getQuantity());
            pstmt.setString(3, food.getExpireDate());
            pstmt.setDouble(4, food.getPrice());
//            pstmt.setDouble(5, food.getDiscount());
//            pstmt.setBoolean(6, food.getDonation());
//            pstmt.setBoolean(7, food.getSale());           
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
}
