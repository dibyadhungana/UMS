<html>
    <head>
        <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
        <title> UMS:Sign up </title>
        
    </head>
    <body>
    <center>
        <h1>Create Your Account</h1>
        <h2>Already have an Account?
            <a herf
               ="login.jsp">
                Login</a>
        </h2>
        <form method="get action="./SignupServlet">
              Name:<input type="text" name="username" placeholder="username"/></br></br>
            Password:<input type="password" name="userPassword" placeholder="password"/></br></br>
            Address:<input type="text" name="UserAddress" placeholder="address"/></br></br>
            Contact:<input type="number" name="UserContact" placeholder="contacr"/></br></br>
            Email:<input type="email" name="email" placeholder="email"/></br></br>
            Birthday:<input type="date" name="birthday" placeholder="birthday"/><br><br>
            Gender:
            </br><input type="radio" name="Male" name="gender"/>Male</br>
            <input type="radio" name="Female" name="gender"/>Female</br>
            <input type="radio" name="other" name="other"/>Other</br></br>
            <input type="submit" name="Create Account" name="Sign Up"/>    
        </form>
    </center>
    </body>
</html>