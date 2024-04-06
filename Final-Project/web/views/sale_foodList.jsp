<%-- 
    Document   : foodList
    Created on : Apr 5, 2024, 2:21:24 PM
    Author     : Hilary H
--%>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@page import="businesslayer.FoodBusinessLogic"%>
<%@page import="java.util.List" %>
<%@page import="model.Food" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Food Waste Reduction Platform</title>

<script>
    
</script>

<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    display: flex;
    flex-direction: column;
    min-height: 100vh;
    background-color: #f9f9f9;
  }
  .header, .footer {
    text-align: center;
    padding: 10px;
    background-color: #fff;
  }
  .footer {
    position: fixed;
    bottom: 0;
    left: 0;
    width: 100%;
    font-size: 12px;
    color: #666;
    padding: 10px 0;
    box-shadow: 0 -2px 5px rgba(0,0,0,0.2);
  }
  table {
    width: 80%;
    margin: 20px auto;
    border-collapse: collapse;
  }
  th, td {
    border: 1px solid #ddd;
    padding: 8px;
    text-align: center;
  }
  th {
    background-color: #f2f2f2;
  }
  .button-container {
    text-align: center;
    padding: 20px;
  }
  button {
    padding: 10px 30px; 
    margin: 0 50px; 
    cursor: pointer; 
    border: none; 
    border-radius: 5px; 
    font-size: 16px; 
    color: white;
  }
  .updatebutton {
    background-color: #4CAF50; 
  }
  #backButton { 
    background-color: #008cba; 
  }

.surplusbutton {
    background-color: #ffcc00; /* Or any other color you prefer */
    margin-top: 50px;
}

.donationbutton {
    color: #008cba; /* Or any other color you prefer */
    margin-top: 50px;
}


  #logoutButton { 
    background-color: #f44336; 
    
    .button-container{
        padding-top: 0;
    }
  }
</style>
</head>
    <body>
        <div class="header">
  <h1>Food Waste Reduction Platform!</h1>
  <p>User name:</p>
  <p>EMAIL : Metro_Kanata@gmail.com</p>
</div>

<table>
    <thead>
  <tr>
    <th>NO</th>
    <th>ITEM</th>
    <th>QUANTITY</th>    
    <th>EXPIRE_DATE</th>
    <th>PRICE</th>
    <th>DISCOUNT_%</th>
<!--    <th>DISCOUNTED_PRICE</th>   -->
<!--    <th>SURPLUS</th>-->
    <th>DONATION</th>
    <th>SALE</th>
    <th>Action</th>
     <!-- Renamed from Select to Action -->
  </tr>
    </thead>
    <tbody>
        <% List<Food> foods = (List<Food>) request.getAttribute("foods");
        for (Food food : foods) {%>
  <tr>
    <td><%= food.getFoodID()%></td>
    <td><%= food.getFoodName()%></td>
    <td><%= food.getQuantity()%></td>
    <td><%= food.getExpireDate()%></td>
    <td><%= food.getPrice()%></td>
    <td><%= food.getDiscount()%></td>
<!--    <td>11.55</td>
    <td>T/F</td>-->
    <td><%= food.getDonation()%></td>
    <td><%= food.getSale()%></td>
    <td>
        <form method="POST" action="SaleFood">
            <!-- Replace the checkbox with an Update button -->
            <button type="submit" name="foodId" value="<%= food.getFoodID()%>" class="deletebutton">Delete</button>
        </form>
    </td>
  </tr>
  <% }%>
  </tbody>
  <!-- Additional rows as needed -->
</table>

<!--<div class="button-container">   
  <form method="GET" action="SurplusFood">
     Replace the checkbox with an Update button 
    <button type="submit" name="foodSurplus" class="surplusbutton">Surplus</button>
  </form>
    <br>  
  <form method="GET" action="DonationFood">
     Replace the checkbox with an Update button 
    <button type="submit" name="foodDonate" class="donatebutton">Donation</button>
  </form>
       <br>  
  <form method="GET" action="SaleFood">
     Replace the checkbox with an Update button 
    <button type="submit" name="foodSale" class="salebutton">Sale</button>
  </form>
    <br> 
  <button type="button" class="updatebutton" onclick="window.location.href='retailer_update_food.jsp'">Update</button>
  <button id="logoutButton" class="button">Logout</button>
</div>-->
  


<div class="footer">
  &copy; Copyright 2024. All Rights Reserved.
</div>
    </body>
</html>
