<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Food Waste Reduction Platform</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }
        .container {
            flex-grow: 1;
            text-align: center;
            padding: 20px;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        .button { 
            padding: 10px 30px; 
            margin: 0 50px; 
            cursor: pointer; 
            border: none; 
            border-radius: 5px; 
            font-size: 16px; 
            color: white;
        }
        #foodListButton { 
            background-color: #008cba; 
            padding: 10px 35px; 
        }
        #addButton { 
            background-color: #4CAF50; 
            padding: 10px 35px;
        }
        .footer {
            position: fixed;
            bottom: 0;
            width: 100%;
            text-align: center;
            font-size: 12px;
            padding: 10px 0;
        }
    </style>
</head>

<script>
document.getElementById("foodListButton").addEventListener("click", function() {
  // 在点击 Add 按钮时执行页面跳转到 retailer_add.html
  window.location.href = "retailer_modify.html";
});
</script>

<body>

    <div class="container">
        <h1>Food Waste Reduction Platform</h1>
        <p>User Name: </p>
        <p>EMAIL: Metro_Kanata@gmail.com</p>

        <form method="POST" action="Food">
<!--            <table>
                <thead>
                    <tr>
                        <th>NO</th>
                        <th>ITEM</th>
                        <th>QUANTITY</th>
                        <th>EXPIRE_DATE</th>
                        <th>PRICE</th>
                    </tr>
                </thead>
                <tbody>
                     示例行 
                    <tr>
                        <td>1</td>
                        <td><input type="text" name="foodName" /></td>
                        <td><input type="number" name="quantity" /></td>
                        <td><input type="text" name="expireDate" /></td>
                        <td><input type="number" name="price" /></td>
                    </tr>
                     更多行可以根据需要添加 
                </tbody>
            </table>

            <div class="button-container">
              <button id="foodListButton" class="button" type="button" onclick="window.location.href='retailer_foodList.html'">Food List</button>
              <button id="addButton" class="button" type="submit">Submit</button>
            </div>-->
<!--            Food Id: 
            <INPUT TYPE="TEXT" NAME="foodId"><br>-->
            Food Name: 
            <INPUT TYPE="TEXT" NAME="foodName"><br><!-- comment -->
            Quantity: 
            <INPUT TYPE="NUMBER" NAME="quantity"><br>
            Expire Date: 
            <INPUT TYPE="TEXT" NAME="expireDate"><br>
            Price: 
            <INPUT TYPE="NUMBER" NAME="price"><br>
            <INPUT TYPE="submit">
<!--            <button id="foodListButton" class="button" type="button" onclick="window.location.href='retailer_foodList.jsp'">Food List</button>-->
        </form>
    </div>

    <div class="footer">
        &copy; Copyright 2024. All Rights Reserved.
    </div>

</body>
</html>