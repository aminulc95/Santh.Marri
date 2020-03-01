package Pages;

import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFile extends Base {

    public void goToWebsite(){
        driver.get("https://www.saucedemo.com/");
    }
    public void enterUsername(String Username){
        myLib.customWait(5);
        WebElement usernameFeild = driver.findElement(By.id("user-name"));
        usernameFeild.sendKeys(Username);
    }
    public void enterPassword(){
        myLib.customWait(5);
        WebElement passwordFiend = driver.findElement(By.id("password"));
        passwordFiend.sendKeys("secret_sauce");
    }
    public void clickSubmit(){
        myLib.customWait(5);
        WebElement submitButton = driver.findElement(By.xpath("//input[@class='btn_action']"));
        submitButton.click();
    }
    public void VerifyingLogin(boolean Login){
        myLib.customWait(5);
        if (Login == true) {
            WebElement productHeader = driver.findElement(By.xpath("//div[@class='product_label']"));
            boolean actual = productHeader.isDisplayed();
            System.out.println("Login did happen");
        } else if (Login == false) {
            System.out.println("Login did not happen");
        }
    }
//public void LoginTestMaster(String Username, boolean AbletoLogin){
//        //@BeforeMethod from BASE page
//        goToWebsite();
//        enterUsername(Username);
//        enterPassword();
//        clickSubmit();
//        VerifyingLogin(AbletoLogin);
//        //@AfterMethod from BASE page
//    }
}

