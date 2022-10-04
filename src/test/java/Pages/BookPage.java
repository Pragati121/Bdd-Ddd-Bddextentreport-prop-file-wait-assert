package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookPage {
    WebDriver driver;
    By Booklink = By.xpath("(//a[contains(text(),'Books')])[1]");
    By AddCArt = By.xpath("//button[contains(@class,'button-2')][1]");
    By Shoppingcart = By.xpath("//a[@class='ico-cart']");
    By AgreeButton = By.xpath("//input[@id=\"termsofservice\"]");
    By Checkout = By.xpath("//button[@name='checkout']");
    By Register = By.xpath("//button[text()='Register']");
    By Femalebutton = By.xpath("//input[@id=\"gender-female\"]");
    By FirstName = By.xpath("//input[@name='FirstName']");
    By Lastname = By.xpath("//input[@name='LastName']");
    By Email = By.xpath("//input[@name='Email']");
    By Address = By.xpath("//input[@name='Company']");
    By Password = By.xpath("//input[@name='Password']");
    By ConfirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    By RegisterButton = By.xpath("//button[@name='register-button']");

    public BookPage(WebDriver driver) {
        this.driver = driver;
    }

    public void BookUser() {
        driver.findElement(Booklink).click();
    }

    public void BookMethod2() {
        driver.findElement(AddCArt).click();
    }

    public void BookMethod3() {
        driver.findElement(Shoppingcart).click();
        driver.findElement(AgreeButton).click();
    }

    public void BookMethod4() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(9));
        driver.findElement(Checkout).click();
        driver.findElement(Register).click();
        driver.findElement(Femalebutton).click();
        driver.findElement(FirstName).click();
        driver.findElement(Lastname).click();
        driver.findElement(Email).click();
        driver.findElement(Address).click();
        driver.findElement(Password).click();
        driver.findElement(ConfirmPassword).click();
        driver.findElement(RegisterButton).click();
    }
}