<%@page import="businesslayer.FoodBusinessLogic"%>
<%@page import="model.Food" %>
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
        form {
    display: grid;
    grid-template-columns: repeat(2, 1fr); /* creates two columns with equal width */
    gap: 10px;
    justify-content: start; /* aligns grid to the start (left) of the container */
    align-items: center;

}

/* Style for the labels */
form label {
    grid-column: 1; /* places label in the first column */
    text-align: right; /* aligns text to the right */
    margin-right: 10px; /* adds space between the label and the select box */
}

/* Style for the select elements */
form select,
form input[type="number"] {
    grid-column: 2; /* places select in the second column */
    justify-self: start; /* aligns select to the start (left) of the column */
    width: fit-content; /* adjusts width to fit the content */
}

/* Additional adjustments to the submit button */
form button {
    grid-column: 1 / -1; /* makes the button span both columns */
    justify-self: center; /* centers the button in the form */
}

/* Reset margin for all form elements */
form select,
form input[type="number"],
form button,
form label {
    margin: 0; /* resets any default margin */
}


.container p:nth-of-type(3) {
    margin-top: 50px; /* Adjust this value as needed for the spacing */
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

    <% Food food = (Food) request.getAttribute("food");%>
    <div class="container">
        <h1>Food Waste Reduction Platform</h1>
        <p>User Name: </p>
        <p>EMAIL: Metro_Kanata@gmail.com</p>
        
    
        <p>Food name: <%= food.getFoodName() %></p>
        

    <form method="POST" action="UpdateFood">
        <!-- Donation -->
        <label for="donation">Donation:</label>
        <select name="donation" id="donation">
            <option value="TRUE">True</option>
            <option value="FALSE">False</option>
        </select><br>

        <!-- Sale -->
        <label for="sale">Sale:</label>
        <select name="sale" id="sale">
            <option value="TRUE">True</option>
            <option value="FALSE">False</option>
        </select><br>

        <!-- Discount -->
        <label for="discount">Discount:</label>
        <input type="number" name="discount" id="discount"><br>

        <button type="submit" name="foodId" value="<%= food.getFoodID()%>">Update</button>
    </form>
    </div>

    <div class="footer">
        &copy; Copyright 2024. All Rights Reserved.
    </div>

</body>
</html>
