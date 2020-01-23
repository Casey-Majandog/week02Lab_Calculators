<%-- 
    Document   : agecalculator
    Created on : Jan 20, 2020, 1:25:50 PM
    Author     : 813793
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form>
            <b>Enter your age: </b> <input type="text" name="age" value="${currentAge}"/> <br/>
            <input type='submit' value='Age next birthday'/>
        </form>
        
        ${nextAge}
       <br/><a href="http://localhost:8084/Week02Lab_Calculators/arithmetic"> Arithmetic Calculator <a/> 
    </body>
</html>
