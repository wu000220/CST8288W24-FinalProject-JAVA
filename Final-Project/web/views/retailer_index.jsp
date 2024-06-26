
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
        grid-template-columns: auto auto;
        gap: 10px;
        justify-content: center;
        align-items: center;
        margin-top: 50px;
    }

    .form-input-group label {
    margin-right: 10px;
}

    form input[type="text"],
    form input[type="number"],
    form input[type="submit"] {
        margin-bottom: 10px; /* Spacing between each row */
    }

    form input[type="submit"] {
        grid-column: span 2; /* Submit button spans across both columns */
    }

    /* Align text to the right */
    form {
        text-align: right;
    }

    /* Make input fields take the remaining space */
    form input[type="text"],
    form input[type="number"] {
        width: 100%;
    }

    .quantity-input {
        margin-top: 25px; /* Adjust the value as needed */
}

    .expireDate-input {
        margin-top: 25px;
    }
        
    .price-input {
        margin-top: 25px;
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
  window.location.href = "retailer_modify.html";
});
</script>

<body>

    <div class="container">
        <h1>Food Waste Reduction Platform</h1>
        <p>User Name: </p>
        <p>EMAIL: Metro_Kanata@gmail.com</p>

        <form method="POST" action="../Food">

            Food Name: 
            <INPUT TYPE="TEXT" NAME="foodName" style="margin-top: 10px;"><br>
            Quantity: 
            <INPUT TYPE="NUMBER" NAME="quantity" class="quantity-input"><br>
            Expire Date: 
            <INPUT TYPE="TEXT" NAME="expireDate" class="expireDate-input"><br>
            Price: 
            <INPUT TYPE="NUMBER" NAME="price" class="price-input"><br>
            <INPUT TYPE="submit">

        </form>
    </div>

    <div class="footer">
        &copy; Copyright 2024. All Rights Reserved.
    </div>
<script>

            window.onload = function () {
                var subscription = "${sessionScope.subscription}";
                if (subscription === "yes") {
                    alert("You subscibes to receive surplus food alerts");
                }
            };

        </script>
</body>
</html>

