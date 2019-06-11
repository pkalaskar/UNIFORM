package PRODUCT;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReturnOrder {

	WebDriver dr;
	ProductAddDelete ap;
	By user_icon=By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/a");
	By order_history=By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a");
	By view_order=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[7]/a");
	By return_icon=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/a[2]");
	By agree_cndn=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input[1]");
	By submit=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input[2]");
	By reasn_radio=By.name("return_reason_id");
	By return_success=By.xpath("//*[@id=\"content\"]/h1");
	By success_msg=By.xpath("//*[@id=\"content\"]/p[1]");

	
	
	public ReturnOrder(WebDriver dr){
		this.dr=dr;
	}
public void remove_order(){
		
	   dr.findElement(user_icon).click();
	   WebDriverWait wt=new WebDriverWait(dr,10);
		wt.until(ExpectedConditions.elementToBeClickable(order_history));

	   dr.findElement(order_history).click();
	   dr.findElement(view_order).click();
	   dr.findElement(return_icon).click();
List<WebElement> li= dr.findElements(reasn_radio);
	  li.get(0).click();
	   
	   dr.findElement(agree_cndn).click();
	   dr.findElement(submit).click();
		
	}
public void verify(){
	String s3=dr.findElement(return_success).getText();
	String s4="PRODUCT RETURNS";
//	String g=s3.substring(0,38);
	Assert.assertEquals(s3,s4);
	System.out.println("Test passed");

	
}

}
