package myTestNGfirstRun;

import org.testng.annotations.Test;

public class InvalidLoginCheck extends TestNGONE
{
	@Test(description="Verify if the user is not able to Login")
	public void inputCredentials()
	{
		System.out.println("Loggedin failed due to invalid credentials");
	}
	

}
