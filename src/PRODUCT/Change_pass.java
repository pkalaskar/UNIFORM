package PRODUCT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Change_pass {

WebDriver dr;
	By clk_pass=By.xpath("//*[@id=\"column-right\"]/div/div[2]/a[3]");
	By enter_pass=By.xpath("//*[@id=\"input-password\"]");
	By cnfrm_pass=By.xpath("//*[@id=\"input-confirm\"]");
	By cntnv=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	By success=By.xpath("/html/body/div[1]/div[1]");
	By error=By.xpath("//*[@id=\"content\"]/form/fieldset/div[2]/div/div");

	public Change_pass(WebDriver dr){
		this.dr=dr;
	}
	public void clk_pass(){
		dr.findElement(clk_pass).click();;

	}
	public void enter_passwd(String m){
		dr.findElement(enter_pass).sendKeys(m);

	}
	public void cnfrm_pass(String m){
		dr.findElement(cnfrm_pass).sendKeys(m);

	}

	public void cntnv(){
dr.findElement(cntnv).click();;

}
	
	
public void get_verfy_text(){
	String e= dr.findElement(success).getText();


    Assert.assertEquals(e,"Success: Your password has been successfully updated.");
    System.out.println("Test passed");

}
public void get_verfy_text1(){
	String e= dr.findElement(error).getText();

 
    Assert.assertEquals(e,"Password confirmation does not match password!");
    System.out.println("Test passed");
}



	public void change_success(){
		
		clk_pass();
		enter_passwd("Jiya");
		cnfrm_pass("Jiya");
		cntnv();
		
	}
public void change_unsuccess(){
		
		clk_pass();
		enter_passwd("jiya");
		cnfrm_pass("Jiya");
		cntnv();
		
	}
}
