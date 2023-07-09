package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PLPage {

    WebDriver driver;

    @FindBy(id = "CONFIRM_AMOUNT")
    WebElement confirmamount;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div/app-create-payment-link/div/div[2]/div/div/form/div[3]/div[2]/p-radiobutton/div/div[2]")
    WebElement sendEmail;

    @FindBy(id = "RECIPIENT_EMAIL")
    WebElement emailField;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div/app-create-payment-link/div/div[2]/div/div/form/div[5]/div[1]/button")
    WebElement sendBtn;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div/app-create-payment-link/p-confirmdialog/div/div/div[3]/button[1]")
    WebElement confirmBtn;
    public PLPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void insertAmount(String Amount){
        confirmamount.sendKeys(Amount);
    }

    public void sendEmail(){
        sendEmail.click();
    }

    public void insertEmail(String email){
        emailField.sendKeys(email);
    }

    public void pressSend(){
        sendBtn.click();
    }

    public void pressConfirm(){
        confirmBtn.click();
    }
}
