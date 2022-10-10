package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
public class ElectronicPage {
    WebDriver driver;
    int number;
    Properties prop;
    By ComputerHyperlink  = By.xpath("//a[text()='Computers ']");
    By NotebookHyperlink  = By.xpath("//a[text()=' Notebooks ']");
    By ClickOnProduct     = By.xpath("//a[contains(text(),'Asus N551JK-XO076H Laptop')]");
    By Addtocartbutton    = By.xpath("//button[@id='add-to-cart-button-5']");
    By Shoppingcartbutton = By.xpath("//a[@class='ico-cart']");
    By ClickonCheckbox    = By.xpath("//input[contains(@name,'termsofservice')]");
    By Checkoutbutton     = By.xpath("//button[@name='checkout']");
    By REgisterButton     = By.xpath("//button[text()='Register']");
    By GenderRadiobutton  = By.xpath("//input[@id='gender-female']");
    By FirstnameTextBox   = By.xpath("//input[@name='FirstName']");
    By LastnameTextBox    = By.xpath("//input[@name='LastName']");
    By DateOFMOnthDropdown= By.xpath("//select[@name='DateOfBirthDay']");
    By ClickOndate        = By.xpath("//option[@value='2']");
    By DateofbirthDropdown= By.xpath("//select[@name='DateOfBirthMonth']");
    By ClickOndateofbirth = By.xpath("//option[contains(text(),'January')]");
    By DateOfYearDropdown =By.xpath("//select[@name='DateOfBirthYear']");
    By ClickOnYear        =By.xpath("//option[@value='2022']");
    By EmailTextbox       = By.xpath("//input[@name=\"Email\"]");
    By AddCompanyName     = By.xpath("//input[@name='Company']");
    By PasswordTextBox    = By.xpath("//input[@name='Password']");
    By ConfPassTextbox    =By.xpath("//input[@name='ConfirmPassword']");
    By FinalRegisterButton     =By.xpath("//button[@name='register-button']");
    public ElectronicPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ElectronicsUser() {
    }
    public void ClickOnComputerHyperlinkAndAddItems() {
        driver.findElement(ComputerHyperlink).click();
        driver.findElement(NotebookHyperlink).click();
        List<WebElement> objectDetails = driver.findElements(By.xpath("//div[@class='product-item']"));
        number = objectDetails.size();
        Assert.assertEquals(number, 6);
        driver.findElement(ClickOnProduct).click();
    }
    public void AddItemsToCartAndClickOnShoppingCart() {
        driver.findElement(Addtocartbutton).click();
        driver.findElement(Shoppingcartbutton).click();
    }
    public void ClickOnCheckboxAndCheckoutbuttonAndAddDetails() {
        driver.findElement(ClickonCheckbox).click();
        driver.findElement(Checkoutbutton).click();
        driver.findElement(REgisterButton).click();
        driver.findElement(GenderRadiobutton).click();
        try {
            prop = new Properties();
            FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//TestData//Resource.Properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(FirstnameTextBox).sendKeys(prop.getProperty("FName"));
        driver.findElement(LastnameTextBox).sendKeys(prop.getProperty("LName"));
        driver.findElement(DateOFMOnthDropdown).click();
        driver.findElement(ClickOndate).click();
        driver.findElement(DateofbirthDropdown).click();
        driver.findElement(ClickOndateofbirth).click();
        driver.findElement(DateOfYearDropdown).click();
        driver.findElement(ClickOnYear).click();
        driver.findElement(EmailTextbox).sendKeys(prop.getProperty("Email"));
        driver.findElement(AddCompanyName).sendKeys(prop.getProperty("CompanyName"));
        driver.findElement(PasswordTextBox).sendKeys(prop.getProperty("Password"));
        driver.findElement(ConfPassTextbox).sendKeys(prop.getProperty("ConfPass"));
        driver.findElement(FinalRegisterButton).click();
    }
}