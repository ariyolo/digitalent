package stepDefinitions.login;


import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;

import static config.env.driver;

public class login {
    WebDriver driver;
    String baseUrl = "https://saucedemo.com";

    @When("input username")
    public void InputUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("input password")
    public void InputPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("click button login")
    public void ClickButtonLogin() {
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    }
}
