package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

/**
 * @author mozudogru
 * @project LamsaWebProject
 */


public class Login_Step_Definitions {

    LoginPage loginPage = new LoginPage();

    @Given("User navigate to login page_EN")
    public void user_navigate_to_login_page_en() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.loginButton.click();
    }

    @When("Premium user enters valid username and password")
    public void premium_user_enters_valid_username_and_password() {
        loginPage.emailBox.sendKeys(ConfigurationReader.get("premium_email"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("premium_password"));
        loginPage.signInButton.click();
    }

    @And("User selects kid as {string}")
    public void user_selects_kid_name_as(String kidName) {
        loginPage.selectKid(kidName).click();
    }

    @Then("Kid name should be displayed on the page as {string}")
    public void kid_name_should_be_displayed_on_the_page_as_a(String expectedName) {
        String actualName = loginPage.userName.getText();
        System.out.println("expectedName = " + expectedName);
        System.out.println("actualName = " + actualName);
        Assert.assertEquals("Verify user name", expectedName, actualName);
    }

    @When("Free user enters valid username and password")
    public void free_user_enters_valid_username_and_password() {
        loginPage.emailBox.sendKeys(ConfigurationReader.get("free_email"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("free_password"));
        loginPage.signInButton.click();
    }

    @Given("User navigate to login page_AR")
    public void user_navigate_to_login_page_ar() {
        Driver.get().get(ConfigurationReader.get("url_AR"));
        loginPage.loginButton_AR.click();
    }

    @When("User enters valid username and invalid password {string}")
    public void user_enters_valid_username_and_invalid_password(String invalidPassword) {
        loginPage.emailBox.sendKeys(ConfigurationReader.get("premium_email"));
        loginPage.passwordBox.sendKeys(invalidPassword);

    }

    @When("User clicks Sign In button")
    public void user_clicks_Sign_In_button() {
        loginPage.signInButton.click();
    }

    @Then("User should see {string} messages")
    public void user_should_see_messages(String expectedAlertMessages) {
        String actualAlertMessage = loginPage.invalidCredentialsAlert.getText();
        System.out.println("expectedAlertMessages = " + expectedAlertMessages);
        System.out.println("actualAlertMessage = " + actualAlertMessage);
        Assert.assertEquals("Verify messages", expectedAlertMessages, actualAlertMessage);
    }

    @When("User enters invalid username {string} and valid password")
    public void user_enters_invalid_username_and_valid_password(String invalidUsername) {
        loginPage.emailBox.sendKeys(invalidUsername);
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("premium_password"));
    }

    @When("User enters valid password and leaves the username field as blank")
    public void user_enters_valid_password_and_leaves_the_username_field_as_blank() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("premium_password"));
    }

    @Then("User should see {string} validation message")
    public void user_should_see_validation_message(String expectedValidationMessage) {
        String actualValidationMessage= loginPage.validationMessage.getText();
        System.out.println("expectedMessage = " + expectedValidationMessage);
        System.out.println("actualMessage = " + actualValidationMessage);
        Assert.assertEquals("Verify Validation Message", expectedValidationMessage,actualValidationMessage);
    }

    @When("User enters valid username and leaves the password field as blank")
    public void user_enters_valid_username_and_leaves_the_password_field_as_blank() {
        loginPage.emailBox.sendKeys(ConfigurationReader.get("premium_email"));
    }


}
