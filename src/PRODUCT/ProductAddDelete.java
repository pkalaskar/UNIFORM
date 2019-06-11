package PRODUCT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductAddDelete {

	WebDriver dr;
	By login_icon=By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/a/span[2]");
	By clk_login=By.xpath("//*[@id=\"top-links1\"]/ul/li[3]/ul/li[2]/a");
	By email=By.xpath("//*[@id=\"input-email\"]");
	By pwd=By.xpath("//*[@id=\"input-password\"]");
	By clk=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By unf=By.xpath("//*[@id=\"logo\"]/h1/a");
	By add=By.xpath("//*[@id=\"featured-grid\"]/div[3]/div/div/div[1]/a/img");
	By size=By.xpath("//*[@id=\"input-option376\"]");
	//*[@id="product"]/div[1]/span
	//*[@id="input-option376"]
	//*[@id="featured-grid"]/div[3]/div/div/div[1]/a/img
	By qnt=By.xpath("//*[@id=\"input-quantity\"]");
	By addcrt=By.xpath("//*[@id=\"button-cart\"]");
	//By clk_cart=By.xpath("//*[@id=\"cart\"]/button");
	//By view_cart=By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong");
	//By see_cart=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");	
	//By shrt=By.xpath("//*[@id=\"featured-grid\"]/div[3]/div/div/div[2]/div[1]/h4/a");	
	By success_view=By.xpath("//div[@class='alert alert-success']//a[contains(text(),'REGULAR T-SHIRTS (Rust)')]");
	By clk_cart=By.xpath("//*[@id=\"cart\"]/button");
	By aftr_clk=By.xpath("//*[@id=\"cart\"]");

	//By check_item=By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[2]/a");

	By rmv_item=By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button/i");
	By check_rmv=By.xpath("//*[@id=\"cart\"]/ul");

	

	public ProductAddDelete(WebDriver dr){
		this.dr=dr;
	}
	
	public void clk_login_icon(){
		
		dr.findElement(login_icon).click();
		WebDriverWait wt=new WebDriverWait(dr,10);
		wt.until(ExpectedConditions.elementToBeClickable(clk_login));


	}
public void clk_login_btn(){
		
		dr.findElement(clk_login).click();
		
	}
public void enter_email(String m){
	
	dr.findElement(email).sendKeys(m);;
	
}
public void enter_pass(String n){
	
	dr.findElement(pwd).sendKeys(n);;
	
}
public void clk_login(){
	
	dr.findElement(clk).click();
	
}
//public void verify(){
//	//dr.findElement(clk_cart).click();;
//	   
//	   String s1=dr.findElement(success_view).getText();
//	   String s2="Success: You have added REGULAR T-SHIRTS (Rust) to your shopping cart!";
//	   //String s5=s4.substring(0,50 );
//   if(s3.equalsIgnoreCase("Success: You have added REGULAR T-SHIRTS (Rust) to your shopping cart!"))
//   
//	   Assert.assertEquals(s1,s2 );
//	   
//	   System.out.println("Test passed");
//
//}
	public void login(){
		clk_login_icon();
		clk_login_btn();
		enter_email("jiya@gmail.com");
		enter_pass("jiya");
		clk_login();
		}
	public void add_prdct(){
		
		dr.findElement(unf).click();
		//String s4=dr.findElement(shrt).getText();
//if(s4.equalsIgnoreCase("REGULAR T-SHIRTS (Rust)"))
//{
//		WebDriverWait wt=new WebDriverWait(dr,100);
//
//		wt.until(ExpectedConditions.elementToBeClickable(add));

		
		   dr.findElement(add).click();;
//}
	       //clear value from quantity field
		   WebElement we=dr.findElement(size);
		   Select s=new Select(we);
		   s.selectByVisibleText("38");
//		   dr.findElement(By.xpath("qnt")).clear();;
//		   dr.findElement(By.xpath("qnt")).sendKeys("1");;
		   dr.findElement(addcrt).click();;
		   
		   }
	public void remove_cart(){
		add_prdct();
		
		   dr.findElement(clk_cart).click();;
//		   String s=dr.findElement(check_item).getText();
	//if(s.equalsIgnoreCase("REGULAR T-SHIRTS (Rust)")){
		   WebDriverWait wt=new WebDriverWait(dr,10);
			wt.until(ExpectedConditions.elementToBeClickable(rmv_item));

			   dr.findElement(rmv_item).click();;

	}
	public void check_remove(){
		
		   dr.findElement(aftr_clk).click();;

		String s1=dr.findElement(check_rmv).getText();
		if(s1.equalsIgnoreCase("Your shopping cart is empty!")){
			System.out.println("test passed");
			}
		}
}
