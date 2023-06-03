package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.*;
import java.util.Properties;

public class AQue2 {

	public static void main(String[] args) 
	{
		
		//2.wac to fetch the data and update the proper data
		//after consuming? and print the bill using get connection(url,proporties ref)
		
		
		Scanner sc=new Scanner(System.in);
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			FileInputStream f1=new FileInputStream("C:\\Users\\Dileep_chintu\\Desktop\\advance_java\\advJ2EE\\src\\jdbcfirst\\cred.properties");
			Properties p1=new Properties();
			p1.load(f1);
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1",p1);
          System.out.println("enter product");
          String pname=sc.nextLine();
         
          System.out.println("enter quantity");
          int q=sc.nextInt();
          int q1=0;
          int quan=0;
          Statement st=con.createStatement();
         ResultSet rs= st.executeQuery("select pname,cost_per_one,quantity from product where pname="+"'"+pname+"'");
          while(rs.next())
          {
        	  String name=rs.getString(1);
        	  q1=rs.getInt(2);
        	   quan=rs.getInt(3);
        	  System.out.println(name+"\t"+q1);
          }
          int amt=q*q1;
          System.out.println("Total Amount is--- "+amt  );
          int resultquan=quan-q;
          st.executeUpdate("update product set quantity="+resultquan+" where pname="+"'"+pname+"'");
          con.close();
		
		

	}
		catch(ClassNotFoundException|SQLException | IOException e)
		{
		
			e.printStackTrace();
		}

}
}
