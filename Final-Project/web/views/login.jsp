<%-- 
    Document   : login
    Created on : Apr. 4, 2024, 11:35:14 p.m.
    Author     : fwu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Food Waste Reduction Platform</title>
        <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            width: 400px; /* Increased width */
            padding: 40px; /* Increased padding */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: white;
            text-align: center;
            border-radius: 10px; /* Added rounded corners for aesthetics */
        }
        .title {
            margin-bottom: 30px;
            font-size: 24px;
        }
        label {
            display: block;
            text-align: left;
            font-size: 18px;
            margin-top: 10px;
        }
        input[type="text"],
        input[type="password"] {
            width: calc(100% - 20px); /* Adjusted for padding */
            padding: 10px;
            margin-top: 5px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .button {
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            margin-right: 10px;
        }
        .login-button {
            background-color: #008cba;
            color: white;
        }
        .cancel-button {
            background-color: #f44336;
            color: white;
        }
        .footer {
            position: fixed;
            bottom: 0;
            width: 100%;
            text-align: center;
            font-size: 12px;
            color: #666;
        }
    </style>
    </head>
    <body>
        <div class="container">
        <div class="title">Food Waste Reduction Platform!</div>
        <form action="../UserLoginServlet" method="post"> <!-- Update action with your server endpoint -->
            <label for="email">Email :</label>
            <input type="text" id="email" name="email">

            <label for="password">PASSWORD :</label>
            <input type="password" id="password" name="password">

            <input type="submit" value="Login" class="button login-button">
            <input type="button" value="Cancel" class="button cancel-button" onclick="window.history.back();"> <!-- Redirects to home page or previous page -->
        </form>
    </div>
    <div class="footer">
        &copy; Copyright 2024. All Rights Reserved.
    </div>
    </body>
</html>
