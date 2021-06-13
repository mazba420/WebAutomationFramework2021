package com.amazon.pages;

import common.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopByDepartment extends TestBase {

   @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement allOption ;

   @FindBy(xpath = "//div[contains(text(),'Electronics')]")
    private WebElement electronics ;

   @FindBy(xpath = "(//ul[@class='hmenu hmenu-visible hmenu-translateX']/li)[3]")
    private WebElement tVAndVideo ;

    @FindBy(xpath = "(//div[@class='bxc-grid__image   bxc-grid__image--light'])[1]")
    private WebElement handPickUPImage ;


   public void allOptionButtonClick(){
       allOption.click();
   }

   public void electricButtonClick(){
       windowsFullPageScrollDown();
       electronics.click();
   }

    public void tvAndVideoButtonClick(){
        tVAndVideo.click();
    }

    public boolean handPickUPImage(){
      return handPickUPImage.isDisplayed();
    }


}
