package AddressBookWorkshop;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddressBookTest 
{
	/**
	 * This test case is use validate the first name Whether it is passed or not
	 */
	@Test
	public void firstNameTest() 
	{
		AddressBook FirstName = new AddressBook();
		boolean result = FirstName.nameValidation("Nikita");
		assertEquals(true,result);
	}
	/**
	 * This test case is use validate the last name Whether it is passed or not
	 */
	@Test
	public void lastNameTest() 
	{
		AddressBook LastName = new AddressBook();
		boolean result = LastName.nameValidation("Rai");
		assertEquals(true,result);
	}
	/**
	 * This test case is use validate the email Whether it is passed or not
	 */
	@Test
	public void emailTest() 
	{
		AddressBook email = new AddressBook();
		boolean result = email.email("abc@gmail.com");
		assertEquals(true,result);
	}
	/**
	 * This test case is use validate the mobile number Whether it is passed or not
	 */
	@Test
	public void mobileNumValidation() 
	{
		AddressBook mobileNum = new AddressBook();
		boolean result = mobileNum.mobileNumValidation("91 9523546770");
		assertEquals(true,result);
	}
}
