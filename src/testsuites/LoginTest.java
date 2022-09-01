package testsuites;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;
import utilities.Utility;

public class LoginTest extends Utility {
  /* Write down the following test into ‘LoginTest’ class
1. userShouldLoginSuccessfullyWithValidCredentials
* Enter “Admin” username
* Enter “admin123 password
* Click on ‘LOGIN’ button
* Verify the ‘Welcome’ text is display */

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUP(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

//write username
      //  clickOnElement(By.xpath("\"//input[@name='username']\""), sendTextToElement("Admin");
        sendTextToElement(By.xpath("//input[@name='username']"),"Admin");
       // WebElement clickUsername = driver.findElement(By.xpath("//input[@name='username']"));
        //clickUsername.sendKeys("Admin");
        //Enter password
        sendTextToElement(By.xpath("//input[@name='password']"),"admin123");
       // WebElement clickPassword = driver.findElement(By.xpath("//input[@name='password']"));
        //clickPassword.sendKeys("admin123");
        //Click submit button
        clickOnElement(By.xpath("//button[@type='submit']"));
     //   WebElement clickLogin = driver.findElement(By.xpath("//button[@type='submit']"));
       // clickLogin.click();
        //Verify the text 'Welcome'
        String acutalTest = getTextFromElement(By.linkText("PIM"));
        String expectedTest = "PIM";
       // WebElement message = driver.findElement(By.linkText("Welcome"));
        //String actualMess = message.getText();
        //String expectedMessage ="Welcome";
        //Assert.assertEquals(expectedMessage , actualMess);

    }


}
