package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.HomePage;
import utils.BaseUtil;

public class HomeKitchenSteps extends BaseUtil {
    HomePage homePage;

    @Given("User launches the browser")
    public void user_launches_browser() {
        setupDriver();
    }

    @When("User navigates to the Naaptol website")
    public void user_navigates_to_site() {
        driver.get("https://www.naaptol.com/");
    }

    @When("User clicks on Home and Kitchen category")
    public void user_clicks_home_kitchen() {
        homePage = new HomePage(driver);
        homePage.clickHomeAndKitchen();
    }

    @Then("User should see Home and Kitchen items")
    public void user_should_see_items() {
        // Add assertion logic
    }

    @When("User searches for {string}")
    public void user_searches_product(String product) {
        homePage.searchProduct(product);
    }

    @Then("Relevant products should be displayed")
    public void relevant_products_displayed() {
        // Add assertion
    }
}
