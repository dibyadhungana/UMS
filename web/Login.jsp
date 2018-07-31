<%-- 
    Document   : Login
    Created on : Jul 11, 2018, 8:43:40 AM
    Author     : kaku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    
        <h1>Login Page</h1>
        <form method ="get" action="./LoginServlet">
            Username:<input type="text" name="username">
        <br><br>
        Password:<input type="password" name="password">
        <br><br>
        <input type="submit" name="Login">
        
        </form>
        <h2>OR</h2>
        <h3><a href="sign up.jsp">
            Sign up</a></h3>
    </body>
</html>
