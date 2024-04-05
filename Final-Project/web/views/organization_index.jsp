<%-- 
    Document   : organization_index
    Created on : Apr. 5, 2024, 1:33:15 p.m.
    Author     : fwu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ORGANIZATION Page</title>
    </head>
    <body>
        <h1>Hello ORGANIZATION!</h1>
        
        
        
        <script>
            window.onload = function () {
                var subscription = "${sessionScope.subscription}";
                if (subscription === "yes") {
                    alert("You subscibes to receive surplus food alerts");
                }
            };
        </script>>
    </body>
</html>
