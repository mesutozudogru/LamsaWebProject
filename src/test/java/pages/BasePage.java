package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * @author mozudogru
 * @project LamsaWebProject
 */


public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
