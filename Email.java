package emailapp;

import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private int mailboxCapacity =500 ;
  private int defaultPasswordlength;
  private String alternateEmail;
  private String companysuffix="Sedge.com";
  
  //constructor to recive for 1st name and last name
  
   public Email(String firstName ,String lastName)
   {
	   this.firstName=firstName;
	   this.lastName=lastName;
	   System.out.println("EMAIL CREATED :" +this.firstName + " " + this.lastName);
	   //call a method asking for the department return the department 
	   this.department =setDepartment();
	   //call a method that returns a random password
	   this.password= randomPassword(10);
	   System.out.println("YOUR PASSWORD IS : " + this.password);
	   //combien elements to generate email
	   String email= firstName.toLowerCase() +"" +lastName.toLowerCase() + "@" + department+ "." + companysuffix;
	   System.out.println("YOUR EMAIL IS : " +email);
   }
   //ask for the department
   private String setDepartment()
   {
	   System.out.println("NEW WORKER " +this.firstName + " " + this.lastName +"\nDEPARTMENT CODES \n 1.Sales\n 2.Development \n 3.Accounting\n 4.Finance\n 0.none\nENTER YOUR DEPARTMENT CODE :");
	   Scanner in=new Scanner(System.in);
	   int depChoice = in.nextInt();
	   if(depChoice == 1)
	   {
		   return "Sales";
	   }
	   else if(depChoice ==2) {
		   return "Dev";   
	   }
	   else if(depChoice==3)
	   {
		   return "Acct";
	   }
	   else if(depChoice==4) {
		   return "Finance";
	   }
	   else 
	   {
		   return " ";   
	   }
	   
   }
   //generate a random password
   private String randomPassword(int length) {
	   String passwordSet="ABCDEFGHFJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	   char[] password =new char[length];
	   for(int i=0;i<length;i++) {
		   int rand =(int)(Math.random() * passwordSet.length());
		   password[i]=passwordSet.charAt(rand);
		   
	   }
	   return new String(password);
   }
   //set the mailbox capacity
    public void setmailboxCapacity(int capacity) {
    	this.mailboxCapacity=capacity;
    	
    }
   //set the alternative mail
    public void setAlternateEmail(String altEmail) {
    	this.alternateEmail=altEmail;
    	
    }
   //change the password
    public void changePassword(String password) {
    	this.password=password;
    }
    
  public int getmailboxCapacity()
  {
	  return mailboxCapacity;
  }
  public String getAlternateEmail() {
	  return alternateEmail;
	  
  }
  public String getpassword()
  {
	  return password;
  }
  public void changePassword() {
		while(true) {	
		System.out.println("Enter a new Password");
		Scanner in5 =new Scanner(System.in);
		String np = in5.nextLine();
		if(np==password) {
			System.out.println("NEW PASSWORD CANNOT BE YOUR OLD PASSWORD\n");
			break;
		}
		else {
			password=np;
		   System.out.println("PASSWORD CHANGED SUCCESSFULLY \nNEW PASSWORD IS :" +password);
		   break;
		}
}
}
}