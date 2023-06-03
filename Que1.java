package test;
import java.util.*;
import java.sql.*;

public class Que1 
{
	
	//1.write a condition to display the entered  data is matched with proper user credentials
	
	
	 static LinkedList<Long> al=new LinkedList<>();
	 static LinkedList<String> l=new LinkedList<>();

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		String dburl="jdbc:mysql://localhost:3306/jdbc1";
		String user="root";
		String pwd="root";
		Connection con=DriverManager.getConnection(dburl, user, pwd);
		System.out.println("enter mobileno");
		long mno=sc.nextLong();
		System.out.println("enter password");
		String str=sc.nextLine();
		str=sc.nextLine();
	    Statement st=con.createStatement();
	    ResultSet res=st.executeQuery("select mobileno,password from project");
	    while(res.next())
	    {
	    	long m=res.getLong(1);
	    	al.add(m);
	    	String s=res.getString(2);
	    	l.add(s);
	    }
	    for(Long m1:al)
	    {
	    	for(String s1:l)
	    	{
	    	    if(m1==mno)
	    	     {
	    	    	if(str.equals(s1))
	    	    	{
	    	     
	    		
	    		      System.out.println("matched");
	    	     }
	    	    }
	    	    System.out.println("not matched");
	    }
	    	}
		}
	    	
		
		
		
		
		catch(ClassNotFoundException|SQLException e)
		{
		
			e.printStackTrace();
		}

	}

}
