<%-- 
    Document   : newjsparithmeticcalculator
    Created on : Sep 23, 2021, 12:47:28 PM
    Author     : hazco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="ArithmeticCalculator">
            <div>
                <label>First: </label>
                <input type="text" name="num1" value="${nm1}">
            </div>
            <div>
                <label>Second: </label>
                <input type="text" name="num2" value="${nm2}">
            </div>
            <div>
                <input type="submit" name="sum" value="+">
                <input type="submit" name="subs" value="-">
                <input type="submit" name="mult" value="*">
                <input type="submit" name="mod" value="%">
            </div>
        </form> 
        <br>  
        <div>    
            <span>${message}</span>
        </div>
        <div>
            <a href="AgeCalculator">Age Calculator</a>
        </div>
    </body>
</html>
