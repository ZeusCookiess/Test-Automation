package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;

    @FindBy(name = "username")
    WebElement usernameField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/div/form/div[3]/button/span[2]")
    WebElement LoginBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void insertUsername(String Username){
        usernameField.sendKeys(Username);
    }

    public void insertPassword(String Password){
        passwordField.sendKeys(Password);
    }

    public void ClickOnLogin(){
        LoginBtn.click();
    }

    public Dashboard LoginAsAMerchant(String Username, String Password){
        insertUsername(Username);
        insertPassword(Password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ClickOnLogin();
        return new Dashboard(driver);
    }
}
