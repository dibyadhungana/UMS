package com.texasintl.ums.servlet;

import com.texasintl.ums.db.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Sanjeet Jung Gurung
 */
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException{
          response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
        String password=request.getParameter("password");
	String username=request.getParameter("username");

        out.println("Details of Login user:"+"<br/>"+"<br/>");
	out.println("Username :"+username+"<br/>");
	out.println("Password :"+password+"<br/>"); 
        
        DatabaseConnection db= new DatabaseConnection();
        Connection cn = DatabaseConnection.getConnection();
        String sql= "insert into login_table(Username,password) values('"+username+"','"+password+"')";
        try{
            Statement stat= cn.createStatement();
            stat.executeUpdate(sql);
            out.print("Inserted");
    }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }

   
}
