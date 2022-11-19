package PageFactory.StepDefination;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_PF {
    WebDriver driver = null;
    LoginPage_PF login;
    HomePage_PF  home;
    @Given("^Browser is open$")
    public void browser_is_open(){
        System.out.println("I am from the login step");
        System.out.println("Inside the step browser is open");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Given("^User is in login page$")
    public void user_is_in_login_page()  {
        System.out.println("Hi I am from the user_is_in_login_page");
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String username, String password){
        login = new LoginPage_PF(driver);
        login.EnterUsername(username);
        login.EnterPassword(password);
        System.out.println("User is on login page");
    }
    @When("^User click on login$")
    public void user_click_on_login() {
        System.out.println("Hi I am from user_click_on_login");
        login.ClickOnLogin();

    }

    @Then("^User is navigated to home page$")
    public void user_is_navigated_to_home_page() throws Throwable {
        System.out.println("Hi I am from User is navigated to home page ");
       home = new HomePage_PF(driver);
        Assert.assertTrue(home.CheckLogoutIsDisplayed());
       driver.close();
       driver.quit();
    }


}
