package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

/**
 * @author mozudogru
 * @project LamsaWebProject
 */


public class LoginPage extends BasePage {

    @FindBy(linkText = "Log In")
    public WebElement loginButton;

    @FindBy(linkText = "تسجيل الدخول")
    public WebElement loginButton_AR;

    @FindBy(css = "#email")
    public WebElement emailBox;

    @FindBy(css = "#password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//p[@class='kids-name']")
    public WebElement userName;

    @FindBy(css = ".alert>div")
    public WebElement invalidCredentialsAlert;

    @FindBy (css = ".invalid-feedback")
    public WebElement validationMessage;


    public WebElement selectKid (String kidName){
        return Driver.get().findElement(By.xpath("//label[contains(.,'"+ kidName+"')]"));
    }
}
