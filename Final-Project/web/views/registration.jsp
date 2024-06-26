<%-- 
    Document   : registration
    Created on : Apr. 4, 2024, 11:37:41 p.m.
    Author     : fwu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration - Food Waste Reduction Platform</title>
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
                width: 400px;
                padding: 40px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                background-color: white;
                text-align: center;
                border-radius: 10px;
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
            input[type="password"],
            input[type="email"] {
                width: calc(100% - 20px);
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
            .signup-button {
                background-color: #4CAF50; /* Changed color for differentiation */
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
            .checkbox-group {
                text-align: left;
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <!--Pop up alert-->
        <div id="alert-box" style="display:none; position: fixed; right: 10px; bottom: 10px; width: 200px; padding: 10px; background: white; border: 1px solid black; border-radius: 5px;">
            Surplus Item Alert !!!<br>
            Please login your account to see the new items.
        </div>

        <div class="container">
            <div class="title">Food Waste Reduction Platform!</div>
            <form action="../UserRegistrationServlet" method="post">


                <label for="email">EMAIL :</label>
                <input type="email" id="email" name="email" required>

                <label for="password">PASSWORD :</label>
                <input type="password" id="password" name="password" required>

                <label for="name">NAME :</label>
                <input type="text" id="name" name="name" required>

                <div class="checkbox-group">
                    <label>Subscription :</label>
                    <label><input type="checkbox" id="subscription-yes" name="subscription" value="yes" onclick="onSubscriptionChanged()"> Yes</label>
                    <label><input type="checkbox" id="subscription-no" name="subscription" value="no" onclick="onSubscriptionChanged()"> No</label>
                </div>

                <div class="checkbox-group">
                    <label>TYPE</label>
                    <label><input type="radio" name="type" value="retailer"> Retailer</label>
                    <label><input type="radio" name="type" value="charitable_organization"> Charitable Organization</label>
                    <label><input type="radio" name="type" value="customer"> Customer</label>
                </div>
                <br><br>

                <input type="submit" value="Sign Up" class="button signup-button">
                <input type="button" value="Cancel" class="button cancel-button" onclick="window.history.back();">
            </form>
        </div>
        <div class="footer">
            &copy; Copyright 2024. All Rights Reserved.
        </div>
    </body>
</html>
