package PRODUCT;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class AdminLogin {
	WebDriver dr;
	String s;
	By adname=By.xpath("//*[@id=\"input-username\"]");
	By pwd=By.xpath("//*[@id=\"input-password\"]");
	By clk=By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button");
	By act=By.xpath("//*[@id=\"content\"]/div[1]/div/h1");
	By err=By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div");

	

public AdminLogin(WebDriver dr){
	this.dr=dr;
}
	public void set_name(String m){
		dr.findElement(adname).sendKeys(m);

	}
	public void set_pass(String n){
		dr.findElement(pwd).sendKeys(n);

	}
	public void click_login(){
		dr.findElement(clk).click();;

	}
		public void valid_login(){
		
		set_name("admin");
		set_pass("admin@123");
		click_login();
	}
	
		public void invalid_login(){
			
			set_name("admin");
			set_pass("admin123");
			click_login();
		}
public void verifyForValid(){
	s= 	dr.findElement(act).getText();

		Assert.assertEquals("Dashboard",s);
		System.out.println("test passed");
	}
	
public void verifyForInvalid(){
	s= 	dr.findElement(err).getText();

String f="No match for Username and/or Password.";
String g=s.substring(0,38);
			Assert.assertEquals(f,g);
			System.out.println("test passed");
	}

}
