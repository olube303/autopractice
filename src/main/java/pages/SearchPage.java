package pages;

import org.openqa.selenium.By;
import utilities.WebDriverHelpers;

public class SearchPage extends WebDriverHelpers {

    private WebDriverHelpers webDriver;

      private By signInLink = By.cssSelector("[class='login']");
      private By emailSignInLink = By.id("email");
      private By passwordSignInLink = By.id("passwd");
      private By clickOnLogin = By.xpath("//div[@id='columns']//p//span[1]");
      private By createSuccessMessage = By.cssSelector("[class='navigation_page']");

      public SearchPage(WebDriverHelpers webDriver){
          this.webDriver = webDriver;
      }

      public void clickOnSignInLink(){
           webDriver.driver.findElement(signInLink).click();
      }

      public void setEmailSignInLink(String email){
          webDriver.driver.findElement(emailSignInLink).sendKeys(email);
      }

      public void setPasswordSignInLink(String password){
          webDriver.driver.findElement(passwordSignInLink).sendKeys(password);
      }

      public void setClickOnLogin(){
          webDriver.driver.findElement(clickOnLogin).click();
      }

      public void setCreateSuccessMessage(){
          webDriver.driver.findElement(createSuccessMessage).getText();
      }

      public String currentURL(){
          return webDriver.driver.getCurrentUrl();
      }
}
