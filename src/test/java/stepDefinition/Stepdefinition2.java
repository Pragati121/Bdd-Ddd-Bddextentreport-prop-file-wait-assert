package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Stepdefinition2 extends BaseCLass {
    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() throws IOException {
       setUpDriver("firefox");
       pageFactory.getElectronicsUser().ElectronicsUser();
    }
    @When("click on electronics")
    public void click_on_electronics() {
    pageFactory.getElectronic23().ElectronicsUser();
    }
    @When("add product")
    public void add_product() {
  pageFactory.getElectronic23().ElectronicMethod2();
    }
    @When("go to shopping cart page")
    public void go_to_shopping_cart_page() {
  pageFactory.getElectronic23().Electonicmethod3();
    }
    @When("click on checkout")
    public void click_on_checkout() {
  pageFactory.getElectronic().ElectronicMethod4();
    }


}
