package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RegistrationPage extends BaseClass   
{
	public RegistrationPage(WebDriver driver) //Creating a constuctor and class variable s der and also constroctor variable
	
	{
		PageFactory.initElements(driver,this);//this becoz classs variable and method variable are equal we use this keyword
	}
	

	
	@FindBy (xpath="//a[@class='ico-register']")//to the which element
   WebElement  registerButton;//name of the webelement
	
	@FindBy (xpath="//label[contains(text(),'Female')]")
	WebElement radio;	
	
	@FindBy (xpath="//*[@id='FirstName']")//to the which element
   WebElement  firstName;//name
	
	@FindBy (xpath="//*[@id='LastName']")//to the which element
	   WebElement  lastName;
	
	@FindBy (xpath="//*[@id='Email']")//to the which element
	   WebElement email;
	
	@FindBy (xpath="//*[@name='Password']")
	WebElement password;
	
	@FindBy (xpath="//*[@name='ConfirmPassword']") 
	WebElement confirmPassword;
	
	@FindBy (xpath="//*[@id='register-button']") 
	WebElement confirmregister;
	
	@FindBy (xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	public void registerUser(String first,String last,String mail  )//method
	{
		 registerButton.click();
		 radio.click();
		 firstName.sendKeys(first);
		 lastName.sendKeys(last);
		 email.sendKeys(mail);
	}
	public void userPassword(String pass,String confirmPass){
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmPass);
		
	}
		public void register() {
			confirmregister.click();
			
		}
		public String user() {
			
			String acc=account.getText();
			return acc;
			
		}
	
	
	
}
