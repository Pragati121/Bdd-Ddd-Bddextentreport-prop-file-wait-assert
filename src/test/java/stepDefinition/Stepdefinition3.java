package stepDefinition;

import io.cucumber.java.en.When;

public class Stepdefinition3 extends BaseCLass {
    @When("click on Books")
    public void click_on_books() {
        setUpDriver("Chrome");
        pageFactory.getBook().BookUser();
    }

    @When("add Book")
    public void add_book() {
        pageFactory.getBook().BookMethod2();
    }

        @When(" go to shopping cart")
        public void go_to_shopping_cart () {
            pageFactory.getBook().BookMethod3();
        }

            @When("click on checkout option")
            public void click_on_checkout_option () {
            pageFactory.getBook().BookMethod4();
            }
        }

