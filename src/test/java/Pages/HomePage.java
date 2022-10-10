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
    By Register=By.xpath("//a[contains(text(),'Register')]");
    By Male=By.xpath("//input[@name='Gender'][1]");
    By Firstname=By.xpath("//input[@name='FirstName']");
    By Lastname=By.xpath("//input[@name='LastName']");
    By Day=By.xpath("//select[@name='DateOfBirthDay']");
    By DayDate=By.xpath("//*[contains(text(),'9')]");
    By Month=By.xpath("//select[@name='DateOfBirthMonth']");
    By MonthName=By.xpath("//*[contains(text(),'March')]");
    By Year=By.xpath("//select[@name='DateOfBirthYear']");
    By YearNo=By.xpath("//*[contains(text(),'2001')]");
    By Email=By.xpath("//input[@name='Email']");
    By Company=By.xpath("//input[@name='Company']");
    By Password=By.xpath("//input[@name='Password']");
    By ConfPassword=By.xpath("//input[@name='ConfirmPassword']");
    By UserRegister =By.xpath("//button[@name='register-button']");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void HomeUser() throws IOException {
        driver.findElement(Register).click();
        driver.findElement(Male).click();
    }
    public void Homemethod() throws IOException {
        String path = System.getProperty("user.dir") + "//src//test//java//TestData//Nopcomdtadriven.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String Fname    = sheet.getRow(1).getCell(0).getStringCellValue();
        String Lname    = sheet.getRow(1).getCell(1).getStringCellValue();
        String email    = sheet.getRow(1).getCell(2).getStringCellValue();
        String company  = sheet.getRow(1).getCell(3).getStringCellValue();
        String password   =sheet.getRow(1).getCell(4).getStringCellValue();
        String conpassword   =sheet.getRow(1).getCell(5).getStringCellValue();
        driver.findElement(Firstname).sendKeys(Fname);
        driver.findElement(Lastname).sendKeys(Lname);
        driver.findElement(Day).click();
        driver.findElement(DayDate).click();
        driver.findElement(Month).click();
        driver.findElement(MonthName).click();
        driver.findElement(Year).click();
        driver.findElement(YearNo).click();
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Company).sendKeys(company);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(ConfPassword).sendKeys(conpassword);
        driver.findElement(UserRegister).click();
    }
}

