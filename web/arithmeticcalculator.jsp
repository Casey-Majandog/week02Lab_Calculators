<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 22, 2020, 1:09:50 PM
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
        <h1>Arithmetic Calculator</h1>
      
        <form>
            
        <b>First:</b> <input type="text" name="first" value="${firstValue}"/> <br/>
        <b>Second:</b> <input type="text" name="second" value="${secondValue}"/> <br/>
        
        <button type="submit" name="mathematic" value="add">+</button>
        <button name="mathematic" value ="sub">-</button>
        <button name="mathematic" value="mult">*</button>
        <button name="mathematic" value="div">%</button>
            
        </form>  
       
        
       

        <br/>
        
        ${result}
        
       <br/>
       
       <a href="http://localhost:8084/Week02Lab_Calculators/age"> Age Calculator <a/>
    </body>
</html>
