package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {

    WebDriver driver;

    @FindBy(name = "username")
    WebElement usernameField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/div/form/div[3]/button/span[2]")
    WebElement LoginBtn;

    public AdminLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



}
