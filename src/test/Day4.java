package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginhomeLoan()
	{
		// Appium
		System.out.println("MoblieLoginhome");
	}
	@Test
	public void LoginAPIhomeLoan()
	{
		// REST API automation
		System.out.println("LoginAPIHome");
	}
	
}
