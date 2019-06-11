package PRODUCT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TESTNG {

WebDriver dr;
AdminLogin al;
ProductAddDelete ap;
Change_pass cp;

Catagory ac;
ReturnOrder ro;

@Given("^ChromeBrowser is launched for admin$")
public void chromebrowser_is_launched_for_admin() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	dr=new ChromeDriver();
	 al=new AdminLogin(dr);
	    ac=new Catagory(dr);

	dr.get("http://uniformm1.upskills.in/admin");

}

@Given("^ChromeBrowser is launched for user$")
public void chromebrowser_is_launched_for_user() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	dr=new ChromeDriver();
	ap=new ProductAddDelete(dr);
   
    cp=new Change_pass(dr);
    ro=new ReturnOrder(dr);
	dr.get("http://uniformm1.upskills.in");
}
@When("^Admin enters valid details and click on login btn$")
public void admin_enters_valid_details_and_click_on_login_btn() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 al.valid_login();
}
@Then("^Dashboard is displayed and Verify admin$")
public void dashboard_is_displayed_and_Verify_admin() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    al.verifyForValid();
}
@When("^Admin enters invalid details and click on login btn$")
public void admin_enters_invalid_details_and_click_on_login_btn() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 al.invalid_login();
}
@Then("^errormsg is displayed and Verify msg$")
public void errormsg_is_displayed_and_Verify_msg() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    al.verifyForInvalid();
}

@When("^user enters valid details and click on login btn$")
public void user_enters_valid_details_and_click_on_login_btn() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ap.login();
}


@When("^user click change password and password changed$")
public void user_click_change_password_and_password_changed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    cp.change_success();
   
}
@When("^user click change password and enter mismatchpassword details$")
public void user_click_change_password_and_enter_mismatchpassword_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
   cp.change_unsuccess();
}
@Then("^verify msg for success$")
public void verify_msg_for_success() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  cp.get_verfy_text();
}

@Then("^verify msg for error$")
public void verify_msg_for_error() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    cp.get_verfy_text1();
}
	
@When("^user clk on uniform store and add the item in the shopping cart$")
public void user_clk_on_uniform_store_and_add_the_item_in_the_shopping_cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ap.add_prdct();
}

@Then("^msg is dislayed for add and verify msg$")
public void msg_is_dislayed_for_add_and_verify_msg() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // ap.verify();
}

@When("^user clk on cart icon and delete the item$")
public void user_clk_on_cart_icon_and_delete_the_item() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ap.remove_cart();
}

@Then("^msg is dislayed for deletion and verify msg$")
public void msg_is_dislayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  ap.check_remove();
}

@When("^admin clk on catlog and catagory entering all details with default values in data and design tabs and saved$")
public void admin_clk_on_catlog_and_catagory_entering_all_details_with_default_values_and_saved() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ac.add_catogory();
}

@Then("^verify save$")
public void verify_save() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ac.verify();
}

@When("^admin clk on catlog and catagory editing  details in meta tilte field with default values and saved$")
public void admin_clk_on_catlog_and_catagory_edeting_details_in_meta_tilte_field_with_default_values_and_saved() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ac.modify_catagory();
}

@Then("^verify edit$")
public void verify_edit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ac.verify();
}
@When("^admin clk on catlog and catagory deleting multiple catagoies$")
public void admin_clk_on_catlog_and_catagory_deleting_multiple_catagoies() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ac.delete_catagory();
}

@Then("^verify delete$")
public void verify_delete() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ac.verify();
}
@Then("^proceed for return$")
public void proceed_for_return() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ro.remove_order();;
}
@Then("^return successful$")
public void return_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ro.verify();
}

}
