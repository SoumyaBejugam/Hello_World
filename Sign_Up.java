package project;
import java.util.*;
import java.util.InputMismatchException;
public class Sign_Up 
{
	public static void sign(int opt)
	{
		Scanner scan=new Scanner(System.in);
		int option1=scan.nextInt();
		String name=null;
		//String cName=Sign_Up.str;
		switch(option1)
		{
		case 1:
		{
			boolean n=true;
			while(n)
			{
			System.out.println("enter your name");
			name=scan.nextLine();
			name=scan.nextLine();
			if(Sign_Up_Validations.nameValidate(name)==true)
			{
				Sign_Up_Validations.isName(name);
				n=false;
			}
			else
			{
				System.out.println("invalid Renter----");
				
			}
			}
			if(Sign_Up_Validations.nameValidate(name))
			{
	            System.out.println("\n 2 For Enter your Mobile_no,\n 3 For Enter your Gmail_Id,\n 4 For Enter your Password,\n 5 For Enter your Age,\n 6 For Enter your Gender,\n 7 For Enter your Atlr_Mobile_No,\n 8 For Enter your Altr_Gmail_Id,\n 9 For Enter your Address,\n 0 For for Submit");
	            sign(option1);
			}
		break;
		}   //CASE 1 CLOSED
		
		case 2:
		{
			boolean m=true;
			long mno=0;
			while(m)
			{
			System.out.println("enter mobile no");
		      mno=scan.nextLong();
		     if(Sign_Up_Validations.mobileValidate(mno))
		     {
		    	 Sign_Up_Validations.isMobile(mno);
		    	 m=false;
		     }
		     else
		     {
		    	 System.out.println("invalid RENTER------");
		    	 
		     }
			}
			if(Sign_Up_Validations.mobileValidate(mno))
			{
	            System.out.println(" \n 1 For Enter your Name ,\n 3 For Enter your Gmail_Id,\n 4 For Enter your Password,\n 5 For Enter your Age,\n 6 For Enter your Gender,\n 7 For Enter your Atlr_Mobile_No,\n 8 For Enter your Altr_Gmail_Id,\n 9 For Enter your Address,\n 0 For for Submit");
	            sign(option1);
			}
			break;
		} //CASE 2 CLOSED
		
		case 3:
		{
			boolean id=true;
			String mail=null;
			while(id)
			{
				System.out.println("enter mail id");
				 mail=scan.nextLine();
				mail=scan.nextLine();
				if(Sign_Up_Validations.mailValidation(mail))
				{
					Sign_Up_Validations.isGmail(mail);
					id=false;
				}
				else
				{
					System.out.println("Invalid RENTER-----");
				}
			}
			if(Sign_Up_Validations.mailValidation(mail))
			{
	            System.out.println("\n 1 For Enter your Name,\n 2 For Enter your Mobile_no,\n 4 For Enter your Password,\n 5 For Enter your Age,\n 6 For Enter your Gender,\n 7 For Enter your Atlr_Mobile_No,\n 8 For Enter your Altr_Gmail_Id,\n 9 For Enter your Address,\n 0 For for Submit");
	            sign(option1);
			}
			break;
		}  // CASE 3 CLOSED
		
		
		case 4:
		{
			boolean p=true;
			String ps=null;
			while(p)
			{
			System.out.println("enter password");
			 ps=scan.nextLine();
			ps=scan.nextLine();
			if(Sign_Up_Validations.passwordValidation(ps))
			{
				Sign_Up_Validations.isPassword(ps);
				p=false;
			}
			else
			{
				System.out.println("Invalid RENTER----");
			}
			}
			
			if(Sign_Up_Validations.passwordValidation(ps))
			{
	            System.out.println("\n 1 For Enter your Name, \n 2 For Enter your Mobile_no,\n 3 For Enter your Gmail_Id, \n 5 For Enter your Age,\n 6 For Enter your Gender,\n 7 For Enter your Atlr_Mobile_No,\n 8 For Enter your Altr_Gmail_Id,\n 9 For Enter your Address,\n 0 For for Submit");
	            sign(option1);
			}
			break;
			
		}  //CASE 4 CLOSED
		
		
		case 5:
		{
			try 
			{
			boolean a=true;
			while(a)
			{
				System.out.println("enter age");
					int age=scan.nextInt();
					if(Sign_Up_Validations.ageValidation(age))
					{
						Sign_Up_Validations.isAge(age);
						a=false;
					}
					else
					{
						System.out.println("Invalid RENTER----");
					}
					
				}
			
			}
			catch (InputMismatchException e) 
			{
				e.printStackTrace();
			}
		} // CASE 5 CLOSED
		
		case 6:
		{
			boolean u=true;
			while(u)
			{
			System.out.println("choose input");
			System.out.println("1.female");
			System.out.println("2.male");
			System.out.println("3.others");
			String gender=scan.nextLine();
			gender=scan.nextLine();
			
			if(Sign_Up_Validations.genValidation(gender))
			{
				Sign_Up_Validations.isGender(gender);
				u=false;
				
			}
			else
			{
				System.out.println("choose any of the options---");
			}
			}
			break;
		} //CASE 6 CLOSED
			
		
		case 7:
		{
			boolean altm=true;
			while(altm)
			{
				System.out.println("enter Alternate mobileno");
			     long altmno=scan.nextLong();
			     if(Sign_Up_Validations.altmnoValidation(altmno))
			     {
			    	 Sign_Up_Validations.isAltmno(altmno);
			    	 altm=false;
			     }
			     else
			     {
			    	 System.out.println("Invalid REENTER-----");
			     }
			}
			break;
		}  //CASE 7 CLOSED
		
		
		case 8:
		{
			boolean altid=true;
			while(altid)
			{
				System.out.println("enter Alternate gmailId");
				String mail=scan.nextLine();
				mail=scan.nextLine();
				if(Sign_Up_Validations.altmailValidation(mail))
				{
					Sign_Up_Validations.isaltmailValidation(mail);
				}
				else
				{
					System.out.println("Invalid RENTER----");
				}
			}
			break;
		}  // CASE 8 CLOSED
		
		case 9:
		{
			System.out.println("enter your address");
			String add=scan.nextLine();
			add=scan.nextLine();
			Sign_Up_Validations.isAddress(add); //setting adress
			
		} // CASE 9 CLOSED
		
		
	
		
		
		
		}  //SWITCH
		
	} //METHOD

} //CLASS
