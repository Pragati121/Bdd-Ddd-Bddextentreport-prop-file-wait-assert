package Pages;
import org.openqa.selenium.WebDriver;

public class PageFactory
{
   private HomePage HomeMethod;
    private ElectronicPage ElectronicMethod;
    private BookPage BookMethod;
    WebDriver driver;

    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }

   public HomePage getHomePage() {
        if (HomeMethod == null) {
           HomeMethod = new HomePage(driver);
       }
       return HomeMethod;
    }
    public ElectronicPage getElectronic() {
        if (ElectronicMethod == null) {
            ElectronicMethod= new ElectronicPage(driver);
        }
        return ElectronicMethod;
    }
    public BookPage getBook() {
        if (BookMethod == null) {
            BookMethod= new BookPage(driver);
        }
        return BookMethod;
    }
}

