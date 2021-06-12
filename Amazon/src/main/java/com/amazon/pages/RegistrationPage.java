package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[9]/div[2]/a[1]/span[1]")
    private WebElement signInButton;
    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    private WebElement createAmazonAccount ;

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    private WebElement name;
    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement password;
    @FindBy(xpath = "//input[@id='ap_password_check']")
    private WebElement reEnterPass;

    @FindBy(xpath = "//h1[contains(text(),'Create account')]")
    private WebElement createAccountText ;




    public void clickObSignInButton(){
        signInButton.click();
    }
    public void clickAmazonAccountlink(){
        createAmazonAccount.click();
    }

    public void UserName(String names){
        name.sendKeys(names);
    }
    public void UserEmail(String emails){
        email.sendKeys(emails);
    }
    public void UserPass(String pass){
        password.sendKeys(pass);
    }
    public void UserReEnterPass(String rePass){
        reEnterPass.sendKeys(rePass);
    }

    public String createAccountText(){
       return createAccountText.getText();
    }





}
