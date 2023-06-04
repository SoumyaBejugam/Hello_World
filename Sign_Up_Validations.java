package project;

public class Sign_Up_Validations 
{
	
	//---------------------NAME VALIDATION FOR SIGNUP-----------
	public static boolean nameValidate(String s)
	{
		String str="";
		int n=s.length();
		if(n>=3)
		{
			
		  for(int i=0;i<n;i++)
		   {
			char ch=s.charAt(i);
			if(ch>=65&&ch<=90||ch>=97&&ch<=122)
			{
				if(i==0&&ch>=65&&ch<=90)
				{
				str=str+ch;
				}
				else
				{
				str=str+ch;
				}
			}
		}
	}
		if(s.equals(str))
		{
			System.out.println("name done");
			return true;
			
		}
		return false;
		
	}
	
	//----------------NAME ENDED------------
	
	//------------SETNAME--------------
	public static void isName(String str)
	{
	      Dto_Class.setName(str);
	     
	}
	
     //---------------MOBILE VALIDATION FOR SIGNUP-----------
	
	public static boolean mobileValidate(long num)
	{
		int c=0;
		while(num!=0)
		{
			c++;
			num/=10;
		}
		if(c==10)
		{
		if(num>=600000000||num<=900000000)
		  {
			  System.out.println( "mno validated");
			  return true;
			
		  }
		  else
		  {
			  System.out.println(" mno not");
			  
		  }
		
		}
		return false;
	}
	
	//--------SET MOBILE---------
	public static void isMobile(long n)
	{
	    Dto_Class.setMobileno(n);
	}
	
	
	//----------GMAIL ID VALIDATION FOR SIGNUP
	public  static boolean mailValidation(String mail)
	
	{
		int n=mail.length();
		int index=0;
		int countsymbol=0;
		int countalpha=0;
		int countdigit=0;
		for(int i=0;i<n;i++)
		{
			char ch=mail.charAt(i);
			 index=mail.indexOf("@gmail.com");
			 if(i<index&&(ch>=65&&ch<=90||ch>=97&&ch<=122))
			 {
				 countalpha++;
			 }
			 else if(i<index&&ch>=48&&ch<=57)
			 {
				 countdigit++;
			 }
			 if(ch=='@')
			 {
				 countsymbol++;
			 }
		}
		if(countalpha>=3&&mail.endsWith("@gmail.com")&&countsymbol==1&&countdigit>=1)
		{
			System.out.println("gmail done");
			return true;
			
		}
		return false;
	}
	
	//-------------SET GAMIL ID------------
	public static void isGmail(String mid)
	{
		Dto_Class.setGmailid(mid);
	}
	
	//--------------PASSWORD VALIDATION FOR SIGNUP---------------
	public static boolean passwordValidation(String pswd)
	{
		int cupper=0;
		int clower=0;
		int cdigit=0;
		int csymbol=0;
		int n=pswd.length();
	if(n>=8)
	{
		for(int i=0;i<n;i++)
		{
			char ch=pswd.charAt(i);
				if(ch>=65&&ch<=90)
				{
					cupper++;
				}
				else if(ch>=97&&ch<=122)
				{
					clower++;
				}
				else if(ch>=48&&ch<=57)
				{
					cdigit++;
				}
				else
				{
					csymbol++;
				}
			
		}
		if(cupper>=1&&clower>=1&&cdigit>=1&&csymbol>=1)
		{
			return true;
		}
	}
		return false;
	}
	
	
	//-------------- SET PASSWORD-----------
	public static void isPassword(String ps)
	{
		Dto_Class.setPassword(ps);
		
	}
	
	
	//------------------AGE VALIDATION FOR SIGNUP-----------
	
	public static boolean ageValidation(int a)
	{
		if(a>=18&&a<60)
		{
			System.out.println("age validated");
			return true;
		}
		return false;
	}
	
	//--------------SET AGE --------------
	public static void isAge(int age)
	{
		Dto_Class.setAge(age);
	}
	
	//---------------GENDER VALIDATION FOR SIGNUP--------------
	public static boolean genValidation(String n)
	{
		if(n.equals("female"))
		{
			return true;
		}
		else if(n.equals("male"))
		{
			return true;
		}
		else if(n.equals("others"))
		{
			return true;
		}
		return false;
		
	}
	
	//------------------SET GENDER-----------
	public static void isGender(String s)
	{
		Dto_Class.setGender(s);
		//System.out.println(Dto_Class.getGender()); 
	}
	
	
	//--------------ALTERNATE MOBILE NO FOR SIGN UP
	public static boolean altmnoValidation(long l)
	{
		int c=0;
		while(l!=0)
		{
			c++;
			l/=10;
		}
		if(c==10)
		{
		if(l>=600000000||l<=900000000)
		  {
			  System.out.println( "mno validated");
			  return true;
			
		  }
		  else
		  {
			  System.out.println(" mno not");
			  
		  }
		
		}
		return false;
		
	}
	
	//--------------SET ALTERNATE MOBILE NO-----------
	public static void isAltmno(long mno)
	{
		Dto_Class.setAltmno(mno);
	}
	
	
	//---------------ALTERNATE GMAIL VALIDATION FOR SIGNUP-------------
	public static boolean altmailValidation(String m)
	{
		int n=m.length();
		int index=0;
		int countsymbol=0;
		int countalpha=0;
		int countdigit=0;
		for(int i=0;i<n;i++)
		{
			char ch=m.charAt(i);
			 index=m.indexOf("@gmail.com");
			 if(i<index&&(ch>=65&&ch<=90||ch>=97&&ch<=122))
			 {
				 countalpha++;
			 }
			 else if(i<index&&ch>=48&&ch<=57)
			 {
				 countdigit++;
			 }
			 if(ch=='@')
			 {
				 countsymbol++;
			 }
		}
		if(countalpha>=3&&m.endsWith("@gmail.com")&&countsymbol==1&&countdigit>=1)
		{
			System.out.println("gmail done");
			return true;
			
		}
		return false;
		
	}
	
	//----------SET ALTERNATE GMAILID-----------
	public static void isaltmailValidation(String str)
	{
		Dto_Class.setAltmailid(str);
	}
	
	//--------------------SET ADDRESS----------
	public static void isAddress(String addr)
	{
		Dto_Class.setAddress(addr);
	}
	
	
	
}


