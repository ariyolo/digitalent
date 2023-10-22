package loginfailed;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class loginfailed {
    WebDriver driver;
    String baseUrl = "https://saucedemo.com";

    @Given("halaman login saucedemo")
    public void halamanLoginSaucedemo() {

    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("1234567");
        throw new io.cucumber.java.PendingException();
    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        throw new io.cucumber.java.PendingException();
    }

}
