package stepdefinition.AddToCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    WebDriver driver;
    String baseUrl = "https://saucedemo.com";


    @Given("the user is on login")
    public void the_user_is_on_login() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    }

    @When("the user clicks the button for SauceLabsBackpack")
    public void the_user_clicks_the_button_for_sauce_labs_backpack() {
        String buttonSelector = "[data-test='add-to-cart-sauce-labs-backpack']";
        driver.findElement(By.cssSelector(buttonSelector)).click();
    }
}
