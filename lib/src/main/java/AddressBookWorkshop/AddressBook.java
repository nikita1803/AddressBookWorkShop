package AddressBookWorkshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome in address book");
		
		/*
		 * List is created with name of personDetail and storing this into the array having string type.
		 */
		List<String> PersonDetail = new ArrayList<String>();
		
		/**
		 * Created a array list of type ContactDetails and calling the function of createContact.
		 */
		 ArrayList<ContactDetails> personDetail= createContact();
       
        /*
         * This for each loop is use to print the data.
         */
        for (String str : PersonDetail)
        {
            System.out.println(str); 
        }
	}
	/**
	 * nameValidation is a method which is use to validate the fname and lname using regex pattern.
	 * @param name
	 * @return boolean value
	 */
	public static boolean nameValidation(String name) 
	{
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern p = Pattern.compile(regex);
		if (name == null) 
		{
			return false;
		}
		 Matcher m = p.matcher(name);
		 return m.matches();	 
	}
	/**
	 * email validation is use to validate the email
	 * @param email
	 * @return boolean value
	 */
	public static boolean email(String email)
	{
		
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(regex);
		if (email == null) 
		{
			return false;
		}
		 Matcher m = p.matcher(email);
		return m.matches();
	}
	/**
	 * mobileNumValidation is a function to check the valid mobile number
	 * @param mobileNum
	 * @return the boolean value 
	 * checking the country code  and 10 digit number must be there
	 */
	public static boolean mobileNumValidation(String mobileNum) 
	{
		String mobileNumber = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(mobileNumber);
		if ( mobileNumber == null )
		{
			return false;
		}
		Matcher m = p.matcher(mobileNum);
		return m.matches();
	}
	/**
	 * This method is use to create contact and store the value into the array
	 * @return
	 */
	public static ArrayList<ContactDetails> createContact()
	{
		ArrayList<ContactDetails> PersonDetail = new ArrayList<ContactDetails>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First name : ");
        String fname = input.nextLine();
        System.out.println(nameValidation(fname)); 	//nameValidation function is called here 
        
        System.out.print("Enter the Last name : ");
        String lname = input.nextLine();
        System.out.println(nameValidation(lname));	//nameValidation function is called here

        System.out.print("Enter the Address : ");
        String address = input.nextLine();
        
        System.out.print("Enter the City : ");
        String city = input.nextLine();

        System.out.print("Enter the state : ");
        String state = input.nextLine();

        System.out.print("Enter the Zip Code : ");
        String zip = input.nextLine();
        
        System.out.print("Enter the phone number: ");
        String phone = input.nextLine();
        System.out.println(mobileNumValidation(phone));	//mobileNumValidation function is called here
        input.nextLine();
        System.out.print("Enter the Email: ");
        String email = input.nextLine();
        System.out.println(email(email));	//email function is called here.
        
        /**
         * Data is added into the personDetail list
         */
        PersonDetail.add(new ContactDetails(fname, lname, address, city, state, zip, phone, email));

        /**
         * For each loop is use to print the data
         */
        for (ContactDetails str : PersonDetail)
        {
            System.out.println(str + " "); 
        }
        return PersonDetail;
	}
}


