package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.io.IOException;
public class BookPageStepDefinition extends BaseCLass {
        @Given("User is on the Home Page")
        public void User_is_on_the_Home_Page() {
        setUpDriver("Chrome");
    }
        @When("click on Books")
        public void click_on_books() {
        pageFactory.getBook().ClickOnBook();
    }
        @And("add Book")
        public void add_book() {
        pageFactory.getBook().AddBookToCart();
    }
        @And("go to shopping cart")
        public void go_to_shopping_cart () {
            pageFactory.getBook().ClickOnShoppingCartButton();
        }
        @And("click on checkout option")
        public void click_on_checkout_option () throws IOException {
            pageFactory.getBook().ClickOnCheckoutAndAddDetails();
            driver.close();
            }
        }

