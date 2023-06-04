package project;
import java.util.*;
import java.util.concurrent.*;
public class Main_class {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		boolean b=true;
		while(b)
		{
		System.out.println("choose options");
		System.out.println(" 1.>>>>>>SIGNUP>>>>>>");
		System.out.println(" 2.>>>>>>LOGIN>>>>>>");
		int option=scan.nextInt();
		
		if(option==1)
		{
			System.out.println("ENTERED FOR SIGNUP ");
			ConcurrentHashMap<Integer,String> s_Details=new ConcurrentHashMap<>();
			s_Details.put(1, "Name");
			s_Details.put(2, "Mobile No");
			s_Details.put(3, "gmail Id");
			s_Details.put(4, "password");
			s_Details.put(5, "Age");
			s_Details.put(6, "gender");
			s_Details.put(7, "Alt Mobile No");
			s_Details.put(8, "Alt Gmail Id");
			s_Details.put(9, "Address");
			s_Details.put(0, "Sumbit");
			System.out.println(s_Details);
			b=false;
			Sign_Up su=new Sign_Up();
			su.sign(option);
		
		}
		
		

	}
	}

}
