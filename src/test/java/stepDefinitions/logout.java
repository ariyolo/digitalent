package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class logout {
    WebDriver driver;
    String baseUrl =  "https://saucedemo.com";

    @Given("halaman login saucedemo")
    public void the_user_is_on_the_Saucedemo_login_page() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @When("the user logs in to Saucedemo")
    public void the_user_logs_in_to_Saucedemo() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    }

    @And("the user logs out")
    public void the_user_logs_out() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}
