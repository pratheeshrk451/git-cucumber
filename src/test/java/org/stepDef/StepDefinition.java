package org.stepDef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.pojo.NewAccountPojo;

import com.baseClass.BaseClass;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass{
	public NewAccountPojo np=new NewAccountPojo();
	@Given("user launch the browser and get url")
	public void user_launch_the_browser_and_get_url() {
		getDreiver();
		getMaximize();
		getUrl("https://www.facebook.com/");
	}
	@Given("user click the createNewAccount button")
	public void user_click_the_create_new_account_button() {
	driver.findElement(By.partialLinkText("Create New Account")).click();
	}
	@When("User enters the first name & sure name")
	public void user_enters_the_first_name_sure_name() throws IOException, InterruptedException {
		wait(3000);
		inserValue(np.getFirstName(), getData(0, 0));
		inserValue(np.getLastName(), getData(0, 1));
	}
	@When("User enter the email and password")
	public void user_enter_the_email_and_password() throws IOException {
		inserValue(np.getEmail(), getData(0, 2));
	}
	@When("user giver DOB and gender")
	public void user_giver_dob_and_gender() {
		dropDownByValue(np.getDay(), "2");
		dropDownByValue(np.getMonth(), "5");
		dropDownByValue(np.getYear(), "2010");
		click(np.getMale());
		
	}
	@When("user Click the signUp button")
	public void user_click_the_sign_up_button() {
		click(np.getSignUp());
		
	}
	@Then("EntersecurityCode page is launched")
	public void entersecurity_code_page_is_launched() {
	}

}
