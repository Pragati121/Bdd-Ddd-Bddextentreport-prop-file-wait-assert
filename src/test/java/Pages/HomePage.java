package Pages;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinition.BaseCLass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class HomePage extends BaseCLass {
    WebDriver driver;
    By RegisterButtton      =By.xpath("//a[contains(text(),'Register')]");
    By MaleRadioButton      =By.xpath("//input[@name='Gender'][1]");
    By FirstnameTextbox     =By.xpath("//input[@name='FirstName']");
    By LastnameTextbox      =By.xpath("//input[@name='LastName']");
    By Daydropdown          =By.xpath("//select[@name='DateOfBirthDay']");
    By ClickOndate          =By.xpath("//*[contains(text(),'9')]");
    By Monthdropdown        =By.xpath("//select[@name='DateOfBirthMonth']");
    By Clickonmonthname     =By.xpath("//*[contains(text(),'March')]");
    By Yeardropdown        =By.xpath("//select[@name='DateOfBirthYear']");
    By Chooseyear          =By.xpath("//*[contains(text(),'2001')]");
    By EmailTextbox        =By.xpath("//input[@name='Email']");
    By CompanyTextbox      =By.xpath("//input[@name='Company']");
    By PasswordTextbox     =By.xpath("//input[@name='Password']");
    By ConfPasswordTextbox =By.xpath("//input[@name='ConfirmPassword']");
    By ClickOnRegisterButton =By.xpath("//button[@name='register-button']");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void HomeUser() throws IOException {
        driver.findElement(RegisterButtton).click();
        driver.findElement(MaleRadioButton).click();
    }
    public void Homemethod() throws IOException {
        String path = System.getProperty("user.dir") + "//src//test//java//TestData//Nopcomdtadriven.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb   = new XSSFWorkbook(prop1);
        XSSFSheet sheet   = wb.getSheet("Sheet1");
        String Fname      = sheet.getRow(1).getCell(0).getStringCellValue();
        String Lname      = sheet.getRow(1).getCell(1).getStringCellValue();
        String email      = sheet.getRow(1).getCell(2).getStringCellValue();
        String company    = sheet.getRow(1).getCell(3).getStringCellValue();
        String password   =sheet.getRow(1).getCell(4).getStringCellValue();
        String conpassword=sheet.getRow(1).getCell(5).getStringCellValue();
        driver.findElement(FirstnameTextbox).sendKeys(Fname);
        driver.findElement(LastnameTextbox).sendKeys(Lname);
        driver.findElement(Daydropdown).click();
        driver.findElement(ClickOndate).click();
        driver.findElement(Monthdropdown).click();
        driver.findElement(Clickonmonthname).click();
        driver.findElement(Yeardropdown).click();
        driver.findElement(Chooseyear).click();
        driver.findElement(EmailTextbox).sendKeys(email);
        driver.findElement(CompanyTextbox).sendKeys(company);
        driver.findElement(PasswordTextbox).sendKeys(password);
        driver.findElement(ConfPasswordTextbox).sendKeys(conpassword);
        driver.findElement(ClickOnRegisterButton).click();
    }
}

