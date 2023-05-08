package lumapages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    @FindBy(css = "div[class='panel header'] li[data-label='or'] a")
    public WebElement signInBttn;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void navigateToSignIn(){
        click(signInBttn);
    }


    }

