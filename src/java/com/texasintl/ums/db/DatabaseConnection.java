
package com.texasintl.ums.db;
    
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection{
	public static Connection getConnection(){
		Connection cn=null;
		String url;
		String driverClass;
		try{
			url="jdbc:mysql://localhost:3306/db_name";
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url,"username", "password");
			System.out.println("connected !");
		}
		catch(Exception ex){
	ex.printStackTrace();
}
return cn;
}
public static void main(String[] args){
	 getConnection();
} 
}
