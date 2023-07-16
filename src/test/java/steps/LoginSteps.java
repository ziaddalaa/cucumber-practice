package steps;

import com.qacart.base.Base;
import com.qacart.pages.HomePage;
import com.qacart.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends Base {

    LoginPage loginPage;
    HomePage homePage;

    @Given("User open the website and go to the login page")
    public void user_open_the_website_and_go_to_the_login_page() {
        launchBrowser();
    }

    @When("User fill a valid email as {string} and valid password as {string} and click on login button")
    public void user_fill_a_valid_email_and_valid_password_and_click_on_login_button(String username, String password) {
        loginPage  = new LoginPage();
        homePage = loginPage.performLogin(username,password);
    }
    @Then("User should be directed to the home page")
    public void user_should_be_directed_to_the_home_page() {
        homePage.isLogoDisplayed();
    }

    @Then("Error message should appear")
    public void error_message_should_appear() {
        loginPage.errorMessage();
    }


}
