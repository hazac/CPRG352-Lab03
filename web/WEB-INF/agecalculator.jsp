<%-- 
    Document   : agecalculator
    Created on : Sep 22, 2021, 4:48:04 PM
    Author     : hazco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="AgeCalculator">
            <div>
                <label>Enter your age: </label>
                <input type="text" name="age">
            </div>
            <input type="submit" name="" value="Age next birthday">
            <div>
                <span>${message}</span>
            </div>
        </form>
        <div>
            <a href="ArithmeticCalculator">Arithmetic Calculator</a>        
        </div>        
    </body>
</html>
