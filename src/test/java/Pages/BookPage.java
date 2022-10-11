package Pages;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
public class BookPage {
    WebDriver driver;
    WebDriverWait wait;
    By BookOption           = By.xpath("(//a[contains(text(),'Books')])[1]");
    By AddCArtButton        = By.xpath("//button[contains(@class,'button-2')][1]");
    By ShoppingcartButton   = By.xpath("//a[@class='ico-cart']");
    By AgreeCheckbox        = By.xpath("//div[@class='terms-of-service']//input");
    By CheckoutButton       = By.xpath("//button[contains(@class,'button-1 checkout-button')]");
    By RegisterButton       = By.xpath("//button[text()='Register']");
    By Femalebutton         = By.xpath("//input[@id=\"gender-female\"]");
    By FirstNameTextbox     = By.xpath("//input[@name='FirstName']");
    By LastNameTextbox      = By.xpath("//input[@name='LastName']");
    By EmailTextbox         = By.xpath("//input[@name='Email']");
    By AddressTextbox       = By.xpath("//input[@name='Company']");
    By PasswordText         = By.xpath("//input[@name='Password']");
    By ConfirmPasswordTextBox= By.xpath("//input[@name='ConfirmPassword']");
    By RegisterButon         = By.xpath("//button[@name='register-button']");
    By ContinueButton        = By.xpath("//a[contains(@class,'button-1')]");

    public BookPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnBook() {
        driver.findElement(BookOption).click();
        wait= new WebDriverWait(driver, Duration.ofSeconds(9000));
    }
    public void AddBookToCart() {
        driver.findElement(AddCArtButton).click();
        driver.findElement(ShoppingcartButton).click();
    }

    public void ClickOnShoppingCartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AgreeCheckbox));
        driver.findElement(AgreeCheckbox).click();
    }
    public void ClickOnCheckoutAndAddDetails() throws IOException {
        driver.findElement(CheckoutButton).click();
        driver.findElement(RegisterButton).click();
        driver.findElement(Femalebutton).click();
        String path = System.getProperty("user.dir") + "//src//test//java//TestData//Nopcomdtadriven.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet2");
        String Fname    = sheet.getRow(1).getCell(0).getStringCellValue();
        String Lname    = sheet.getRow(1).getCell(1).getStringCellValue();
        String email    = sheet.getRow(1).getCell(2).getStringCellValue();
        String Add   = sheet.getRow(1).getCell(3).getStringCellValue();
        String Pass    = sheet.getRow(1).getCell(4).getStringCellValue();
        String ConfPass  = sheet.getRow(1).getCell(5).getStringCellValue();
        driver.findElement(FirstNameTextbox).sendKeys(Fname);
        driver.findElement(LastNameTextbox).sendKeys(Lname);
        driver.findElement(EmailTextbox).sendKeys(email);
        driver.findElement(AddressTextbox).sendKeys(Add);
        driver.findElement(PasswordText).sendKeys(Pass);
        driver.findElement(ConfirmPasswordTextBox).sendKeys(ConfPass);
        driver.findElement(RegisterButon).click();
        driver.findElement(ContinueButton).click();
    }
}