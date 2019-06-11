package PRODUCT;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Catagory {
WebDriver dr;

	By clk_catalog=By.xpath("//*[@id=\"catalog\"]/a/i");
	By clk_catagory=By.xpath("//*[@id=\"catalog\"]/ul/li[1]/a");

	//By see_catagory=By.xpath("//*[@id=\"content\"]/div[1]/div/h1");
	By catagory_name_title=By.xpath("//*[@id=\"form-category\"]/div/table/thead/tr/td[2]/a");

	
	By add_catagory=By.xpath("//*[@id=\"content\"]/div[1]/div/div/a[1]");
	//By name_catagory=By.xpath("//*[@id=\"form-category\"]/div/table/thead/tr/td[2]/a");
	By add_cat_pge=By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/h3");
	By cat_name=By.xpath("//*[@id=\"input-name1\"]");
	By cat_dscrptn=By.xpath("//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]");
	By meta_tag_title=By.xpath("//*[@id=\"input-meta-title1\"]");
	By meta_tag_dsrcptn=By.xpath("//*[@id=\"input-meta-description1\"]");
	By data=By.xpath("//*[@id=\"form-category\"]/ul/li[2]/a");
//	By data_parent=By.xpath("//*[@id=\"input-parent\"]");
//	By data_filters=By.xpath("//*[@id=\"input-filter\"]");
	By data_store=By.xpath("//*[@id=\"tab-data\"]/div[3]/div/div/div/label/input");
	By data_col=By.xpath("//*[@id=\"input-column\"]");
	By data_sort=By.xpath("//*[@id=\"input-sort-order\"]");
	By data_status=By.xpath("//*[@id=\"input-status\"]");
	//By data_status_drpdwn=By.xpath("//*[@id=\"input-status\"]");
    By design=By.xpath("//*[@id=\"input-sort-order\"]");
    By save=By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");
    By success=By.xpath("//*[@id=\"content\"]/div[2]/div[1]");
    By edit_catagory_icon=By.xpath("//*[@id=\"form-category\"]/div/table/tbody/tr[1]/td[4]/a");
    By edit_catagory_page=By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/h3");
    By delete_catagory_chechbox1=By.xpath("//*[@id=\"form-category\"]/div/table/tbody/tr[1]/td[1]/input");
    By delete_catagory_chechbox2=By.xpath("//*[@id=\"form-category\"]/div/table/tbody/tr[2]/td[1]/input");

    By delete_btn=By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");
  
  
 
 
    
    public Catagory(WebDriver dr){
    	this.dr=dr;
    }
	public void add_catogory(){
		dr.findElement(clk_catalog).click();
		dr.findElement(clk_catagory).click();
		String s=dr.findElement(catagory_name_title).getText();

		Assert.assertEquals(s, "Category Name");
		dr.findElement(add_catagory).click();
		String s1=dr.findElement(add_cat_pge).getText();
		Assert.assertEquals(s1, "Add Category");
		dr.findElement(cat_name).sendKeys("Blazer");;
		dr.findElement(cat_dscrptn).sendKeys("Blazer catogory contains all type of Blazers");;
		dr.findElement(meta_tag_title).sendKeys("BLZ 03");;
		dr.findElement(meta_tag_dsrcptn).sendKeys("Blazers for primary class students");;
		dr.findElement(data).click();
        //		if(dr.findElement(data_store).isSelected()){
        //		}
        //		else{
        //			dr.findElement(data_store).click();;
        //		}
		//dr.findElement(data_col).sendKeys("1");;
		//dr.findElement(data_sort).sendKeys("0");;
        // WebElement we=dr.findElement(data_status);
	    //Select s2=new Select(we);
        //s2.selectByVisibleText("Enabled");
		dr.findElement(design).click();;
		dr.findElement(save).click();;
}

	public void modify_catagory(){
		dr.findElement(clk_catalog).click();
		dr.findElement(clk_catagory).click();
		String s=dr.findElement(catagory_name_title).getText();

		Assert.assertEquals(s, "Category Name");
		dr.findElement(edit_catagory_icon).click();
		dr.findElement(meta_tag_title).clear();
		dr.findElement(meta_tag_title).sendKeys("BLZ 567");;
		dr.findElement(meta_tag_dsrcptn).clear();;
		dr.findElement(meta_tag_dsrcptn).sendKeys("Uniform");;
		dr.findElement(data).click();
//		if(dr.findElement(data_store).isSelected()){
//		}
//		else{
//			dr.findElement(data_store).click();;
//		}
//		dr.findElement(data_col).sendKeys("1");;
//		dr.findElement(data_sort).sendKeys("0");;
//WebElement we=dr.findElement(data_status);
//		
//		Select s2=new Select(we);
//		s2.selectByVisibleText("Enabled");
		dr.findElement(design).click();;
		dr.findElement(save).click();;
		
		
		
	}
	public void delete_catagory(){
		
		dr.findElement(clk_catalog).click();
		dr.findElement(clk_catagory).click();
		String s=dr.findElement(catagory_name_title).getText();

		Assert.assertEquals(s, "Category Name");

		dr.findElement(delete_catagory_chechbox1).click();
		dr.findElement(delete_catagory_chechbox2).click();

		dr.findElement(delete_btn).click();
		Alert a=dr.switchTo().alert();
		a.accept();
	}
public void verify(){
	String s3=dr.findElement(success).getText();
	String s4="Success: You have modified categories!";
	String g=s3.substring(0,38);
	Assert.assertEquals(g,s4);
	System.out.println("Test passed");

	
}

}