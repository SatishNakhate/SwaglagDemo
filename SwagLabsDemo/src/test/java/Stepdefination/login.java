package Stepdefination;

import Pagefactory.LoginPage_PF;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class login {
    private static final Logger log = LoggerFactory.getLogger(login.class);
    WebDriver driver= null;
    LoginPage_PF login;


    @Given("Browser is open")
    public void browser_is_open() {
        System.out.println("browser is open");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


    }
    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
        driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");


    }
    @When("^User enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws AWTException, InterruptedException {
        System.out.println("User login successfully");
        login = new LoginPage_PF(driver);
        login.ENTuserName(username);
        login.ENTPassword(password);
        login.LoginButton();
        Thread.sleep(10000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @Then("user is navigated to the product page")
    public void user_is_navigated_to_the_product_page() {

    }
    @Given("The user is product page")
    public void the_user_is_product_page() {

    }

    //New Scenario - User select the product successfully
    @When("User click on the Add to cart")
    public void user_click_on_the_add_to_cart() {
        System.out.println("Product is added to cart");
        login = new LoginPage_PF(driver);
        login.clickOnAddToCart();
    }
    @When("click on the cart")
    public void click_on_the_cart() {
        System.out.println("Cart is open");
        login.clickOnCart();
    }
    @When("click on the checkout")
    public void click_on_the_checkout() {
        System.out.println("Checkout the product");
        login.clckOnCheckout();
        System.out.println(driver.getCurrentUrl());
    }
    @When("User enter checkout details {string} and {string} and {string}")
    public void user_enter_checkout_details(String Fname, String Lname, String zipcode) throws InterruptedException {
        System.out.println("User enters deatils");
        login.ENTFirstName(Fname);
        login.ENTlastname(Lname);
        login.ENTZipcode(zipcode);
    }
    @When("User click on continue")
    public void user_click_on_continue() {
        login.clickContinue();
    }
    @When("user click on the finish button")
    public void user_click_on_the_finish_button() {
        login.clickFinish();
    }
    @Then("User navigate to the success page")
    public void user_navigate_to_the_success_page() {

    }

    @When("user click on toggle")
    public void user_click_on_toggle() {
        login.clickToggle();
    }
    @When("user click on the about page")
    public void user_click_on_the_about_page() {
        login.clickAbout();
    }
    @Then("user redirect back product inventory page")
    public void user_redirect_back_product_inventory_page() {
        driver.navigate().back();
        login.clickToggle();
        login.clickLogout();
    }



}
