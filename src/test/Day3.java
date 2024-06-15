package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void BFClass()
	{
		System.out.println("I will execute before every test cases in day 3 class");
	}

	@Parameters({"URL", "APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname, String key)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void AfMethod()
	{
		System.out.println("I will execute after every test method in day class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After executing all methods in the class");
	}
	
	
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		// Appium
		System.out.println("MoblieLoginCar");
	}
	
	@BeforeSuite
	public void BFSuite()
	{
		System.out.println("I am no. 1");
	}
	
	@Test(enabled=false)
	public void MobileSignincarLoan()
	{
		// Appium
		System.out.println("Moblie IN");
	}
	@Test(dataProvider="getData")
	public void MobileSignOutcarLoan(String username, String password)
	{
		// Appium
		System.out.println("Moblie SignOUT");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void APIcarLoan()
	{
		// REST API automation
		System.out.println("LoginAPICar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 1st combination - username password - good credit history
		// 2nd combination - username, password - no credit history
		// 3rd combination - Fraudulent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][1] = "firstsetusername";
		data[0][1] = "firstpassword";
		// Columns in the row are nothing but values for that particular combination(row)
		
		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}
	
}
