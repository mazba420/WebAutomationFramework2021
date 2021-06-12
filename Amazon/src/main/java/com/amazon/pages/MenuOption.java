package com.amazon.pages;

import common.TestBase;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuOption extends TestBase {

  @FindBy(xpath = "//select[@id='searchDropdownBox']")
    private WebElement allOptions ;

  @FindBy(xpath = "//option[contains(text(),'Audible Books & Originals')]")
  private WebElement audioBook;


  @Step("Click all the selected option from Option bar...........")
  public void validateMobileApp(){
      selectByVisibleText(allOptions,"All Departments");
      sleepFor(1);
      selectByVisibleText(allOptions,"Audible Books & Originals");
      sleepFor(1);
      selectByVisibleText(allOptions,"Alexa Skills");
      sleepFor(1);
      selectByVisibleText(allOptions,"Amazon Devices");
      sleepFor(1);
      selectByVisibleText(allOptions,"Amazon Pharmacy");
      sleepFor(1);
      selectByVisibleText(allOptions,"Amazon Warehouse");
  }


  @Step("Verify audio book link is display....")
  public boolean optionsDisplay(){
     return audioBook.isDisplayed();
  }






}
