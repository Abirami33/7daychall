package org.challenge.maven.maven;

import java.util.ArrayList;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
class L_user {

	//other details
	String firstName;
	String lastName;
	int age;
	long salary;
	String dateOfBirth;
	
	//Two parameter constructor to store first name and last name
	public L_user(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;	
	}
	
	//to store other details
	public L_user(int age,long salary,String dateOfBirth) {
	this.age=age;
	this.salary=salary;
	this.dateOfBirth=dateOfBirth;
	}
	
	//to print the collected user details
	public void info()
	{
		System.out.print(firstName +" "+ lastName );
	}
}

public class User
{
	private static Scanner key;

	public static void main(String[] args) {
		
		   
		
		    key = new Scanner(System.in);
		    
		    //System.out.println("Number of users:");
		   // int n=key.nextInt();
		     
		    System.out.println("firstname:");
		    String fn=key.nextLine();
		    
		    
		    //to capitalize first letter if it's entered small
		    if(Character.isUpperCase(fn.charAt(0))==false)
			{
		      fn=StringUtils.capitalize(fn);
			}

		    System.out.println("lastname:");
		    String ln=key.nextLine();
		    
		    //creating user objects
			L_user info1=new L_user(fn,ln);

			
	        
		    //collecting other details 
		    System.out.println("Age:");
		    int age=key.nextInt();
		    key.nextLine();
		    
		    System.out.println("salary:");
		    long sal=key.nextLong();
		    key.nextLine();
		    
		    System.out.println("DateOfBirth:");
		    String dob=key.nextLine();
		    
		    System.out.println("First"+" "+"Last"+" "+"Age"+" "+"Salary"+" "+"DOB");
		    
		    
		  //adding to the list
			ArrayList<Object> users = new ArrayList<Object>();
	           users.add(info1);
	           
		   //calling name display method
	        for (Object o: users)
	        {
	            ((L_user) o).info();
	        }
	        
		    System.out.print(" ");
		    System.out.print(age +" "+ sal+" "+ dob);
	    
		    }
			


}
