package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class NewAccountPojo extends BaseClass{
public NewAccountPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(partialLinkText="Create New Account")
private WebElement newAccount;
public WebElement getNewAccount() {
	return newAccount;
}
@FindBy(id="u_2_b_uW")
private WebElement firstName;
@FindBy(id="u_2_d_0/")
private WebElement lastName;
@FindBy(id="u_2_g_3U")
private WebElement email;
@FindBy(id="password_step_input")
private WebElement passWord;
@FindBy(id="day")
private WebElement day;
@FindBy(id="month")
private WebElement month;
@FindBy(name="birthday_year")
private WebElement year;
@FindBy(id="u_2_3_iX")
private WebElement male;
@FindBy(id="u_2_s_bJ")
private WebElement signUp;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassWord() {
	return passWord;
}
public WebElement getDay() {
	return day;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getMale() {
	return male;
}
public WebElement getSignUp() {
	return signUp;
}



}