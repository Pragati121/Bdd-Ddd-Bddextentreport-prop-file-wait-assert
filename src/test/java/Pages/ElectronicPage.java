package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ElectronicPage {
    WebDriver driver;

    int number;
    By WelcomePage       =By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By ComputerHyperlink = By.xpath("//a[text()='Computers ']");
    By Notebook          = By.xpath("//a[text()=' Notebooks ']");
    By Product = By.xpath("//a[contains(text(),'Asus N551JK-XO076H Laptop')]");
    By Cart2             = By.xpath("//button[@id='add-to-cart-button-5']");
    By Shoppingcart      =  By.xpath("//a[@class='ico-cart']");
    By Checkbox          =  By.xpath("//input[contains(@name,'termsofservice')]");
    By Checkout          = By.xpath("//button[@name='checkout']");
    By REgisterButton    = By.xpath("//button[text()='Register']");
    By Gender            = By.xpath("//input[@id='gender-female']");
    public ElectronicPage(WebDriver driver){
        this.driver = driver;
    }

    public void ElectronicsUser() {
       // String actual = driver.findElement(WelcomePage).getText();
       // Assert.isTrue(actual.equals("Welcome to our store"), "Expected result does not match with actual result");
    }
    public void ElectronicMethod2() {
        driver.findElement(ComputerHyperlink).click();
        driver.findElement(Notebook).click();
        List<WebElement> objectDetails = driver.findElements(By.xpath("//div[@class='product-item']"));
        number = objectDetails.size();
        Assert.assertEquals(number,6);
        driver.findElement(Product).click();
    }
    public void Electonicmethod3() {
        driver.findElement(Cart2).click();
        driver.findElement(Shoppingcart).click();
    }
    public void ElectronicMethod4(){
        driver.findElement(Checkbox).click();
        driver.findElement(Checkout).click();
        driver.findElement(REgisterButton).click();
        driver.findElement(Gender).click();
        System.out.println(Gender);
    }
}