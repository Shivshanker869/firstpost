package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By homeAndKitchen = By.xpath("//a[text()='Home & Kitchen']");
    By searchBox = By.id("header_search_text");
    By searchButton = By.id("header_search_button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHomeAndKitchen() {
        driver.findElement(homeAndKitchen).click();
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }
}
