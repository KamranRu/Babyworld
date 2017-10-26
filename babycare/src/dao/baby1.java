package dao;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class baby1 {
	public static boolean check(String username,String password){
		boolean status=false;
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kamran","root","root");
			PreparedStatement ps=con.prepareStatement("select * from login where username=? and password=?");
		ps.setString(1,username);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		System.out.println("Database is working !");
		while(rs.next()) {
			if(status=true){
				String ka1 =rs.getString(1);
				String ka2 =rs.getString(2);
			}
			}
		}catch(Exception e)
		{
			System.out.println("My class not found"+e.getMessage());   //
		}
	return status;
	}
	}

