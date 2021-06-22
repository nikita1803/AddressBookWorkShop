package AddressBookWorkshop;

public class ContactDetails 
{
/**
 * Initializing the variable of string type
 */
	private String firstName;
    private String lastName;
    private String area;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    /**
     * Parameterized constructor is created.
     * @param firstName
     * @param lastName
     * @param area
     * @param city
     * @param state
     * @param zip
     * @param phoneNumber
     * @param email
     */
    public ContactDetails(String firstName, String lastName, String area, String city, String state, String zip, String phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.area = area;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * This method is use to get the firstname 
     * @return
     */
    public String getFirstName() 
    {
        return this.firstName;
    }

    /**
     * set is use to set the first name
     * @param firstName
     */
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    /**
     * This method is use to get the last name.
     * @return
     */

    public String getLastName() 
    {
        return this.lastName;
    }

    /**
     * This method is use to set the last name.
     * @param lastName
     */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    /**
     * This method is use to get area .
     * @return
     */
    public String getArea()
    {
    	return this.area;
    }
    /**
     * This method is use to set the area
     * @param area
     */
    public void setArea(String area) 
    {
        this.area = area;
    }

    /**
     * This method is use to get the city
     * @return
     */
    public String getCity() 
    {
        return this.city;
    }

    /**
     * This method is use to set the city
     * @param city
     */
    public void setCity(String city) 
    {
        this.city = city;
    }

    /**
     * This method is use to get the state
     * @return
     */
    public String getState() 
    {
        return this.state;
    }

    public void setState(String state) 
    {
        this.state = state;
    }
    /**
     * This method is use to get the zip
     * @return
     */
    public String getZip()
    {
    	return this.zip;
    }
    /**
     * This method is use to set the zip
     * @param zip
     */
    public void setZip(String zip) 
    {
        this.zip = zip;
    }
    /**
     * This method is use to get the phone number
     * @return
     */
    
    public String getPhoneNumber()
    {
    	return this.phoneNumber;
    }
    /**
     * This method is use to set the phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
    /**
     * This method is use get the email
     * @return
     */
    public String getEmail()
    {
    	return this.email;
    }
    /**
     * This method is use to set the email.
     * @param email
     */
    public void setEmail(String email) 
    {
        this.email = email;
    }

    /**
     * This method use to print all the value.
     */
    public String toString() 
    {
        return "Details of: " + firstName + " " + lastName + "\n"
                + "Address: " + area + "\n"
                + "City: " + city + "\n"
                + "State: " + state + "\n"
                + "Zip: " + zip + "\n"
                + "Phone Number: " + phoneNumber + "\n"
                + "Email: " + email;
    }
}
