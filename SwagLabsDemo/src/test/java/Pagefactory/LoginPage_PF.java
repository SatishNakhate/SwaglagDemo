package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    WebDriver driver;
    public LoginPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this); //Initialization driver
    }

    @FindBy(id = "user-name")
    WebElement txt_UserName;

    @FindBy(id = "password")
    WebElement txt_Password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement  login_Button;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement click_AddToCart;

    @FindBy(id = "shopping_cart_container")
    WebElement click_cart;

    @FindBy(id = "checkout")
    WebElement click_Checkout;

    @FindBy(id = "first-name")
    WebElement txt_FirstName;

    @FindBy(id = "last-name")
    WebElement txt_LastName;

    @FindBy(id = "postal-code")
    WebElement num_Zipcode;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement click_continue;

    @FindBy(xpath = " //button[@id='finish']")
    WebElement click_finish;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement click_toggle;

    @FindBy(xpath = "//a[@id='about_sidebar_link']")
    WebElement click_about;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement click_logout;





    // Methods of the WebElements

    public void ENTuserName(String username){
        txt_UserName.sendKeys(username);
    }
    public void ENTPassword(String password){
        txt_Password.sendKeys(password);
    }
    public void LoginButton(){
        login_Button.click();
    }
    public void clickOnAddToCart(){
        click_AddToCart.click();
    }

    public void clickOnCart(){
        click_cart.click();
    }

    public void clckOnCheckout(){
        click_Checkout.click();
    }

    public void ENTFirstName(String Fname){
        txt_FirstName.sendKeys(Fname);
    }

    public void ENTlastname(String Lname){
        txt_LastName.sendKeys(Lname);
    }

    public void ENTZipcode(String zipcode){
        num_Zipcode.sendKeys(zipcode);
    }

    public void clickContinue(){
        click_continue.click();
    }
    public void clickFinish(){
        click_finish.click();
    }

    public void clickToggle(){
        click_toggle.click();
    }

    public void clickAbout(){
        click_about.click();
    }

    public void clickLogout(){
        click_logout.click();
    }
}