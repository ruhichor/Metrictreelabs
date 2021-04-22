package testscript;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.Precondition;
import pom.Login_Page;

public class Login_Flow extends Precondition{

	//Cancel Subscription
	 @Test(invocationCount = 01)
    public void Physician_Valid_Login() throws InterruptedException {
		test=extent.createTest("Main Page Cancel Subscription");
		test.log(Status.INFO, "Main Page Cancel Subscription test script started executing");
		    
		 Login_Page LP = new Login_Page(driver);
		//AH.clickGet30DaysFreeButton();
		LP.clickEmail();
		Thread.sleep(1000);
		LP.setEmail(validemail1);
		test.pass("Entered Valid Email");
		LP.clickPassword();
		Thread.sleep(1000);
		LP.setPassword(validpassword1);
		test.pass("Entered Valid Password");
		Thread.sleep(1000);
		LP.clickLogin();
		
		Thread.sleep(5000);
	    String actualurl = driver.getCurrentUrl();
	    System.out.println(actualurl);
	    AssertJUnit.assertEquals(actualurl, "https://physician-qa.siterx.com/home/suggestion-patients");
	    test.pass("Test script Passed");
		
		
}

}
