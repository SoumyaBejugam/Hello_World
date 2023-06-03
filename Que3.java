package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) 
	{
		//3. wac to create 2tables storing the app details and customer details and 
		//print the maximum and minimum times used apps. and max and min times the customer purchasing
		
		
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		String dburl="jdbc:mysql://localhost:3306/jdbc1";
		String user="root";
		String pwd="root";
		Connection con=DriverManager.getConnection(dburl, user, pwd);
		 Statement st=con.createStatement();
         ResultSet rs= st.executeQuery("select MAX(no_of_used), MIN(no_of_used) from app where no_of_used!=0");
          while(rs.next())
          {
        	  int maxA=rs.getInt(1);
        	  int minA=rs.getInt(2);
        	  System.out.println("max used--- "+maxA);
        	  System.out.println("min used--- "+minA);
        	 
        	  
          }
          
          ResultSet rs1= st.executeQuery("select MAX(no_of_purchase), MIN(no_of_purchase) from customer where no_of_purchase!=0");
          while(rs1.next())
          {
        	  int maxP=rs1.getInt(1);
        	  int minP=rs1.getInt(2);
        	  System.out.println("max used--- "+maxP);
        	  System.out.println("min used--- "+minP);
        	 
        	  
          }
          
		}
          catch(ClassNotFoundException|SQLException e)
			{
			
				e.printStackTrace();
			}
	}
}
