package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TemplatePage {

    WebDriver driver;

    @FindBy(id = "templateEnName")
    WebElement TempEnName;

    @FindBy(id = "templateEnName")
    WebElement TempArName;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div/app-create-payment-link-template/form/div[1]/div/div/div/div[4]/span/div/p-checkbox/div/div[2]")
    WebElement DefaulTempCheckbox;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div/app-create-payment-link-template/form/div[2]/div[1]/button")
    WebElement SaveBtn;

    public TemplatePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private void insertTempEnName(String TempEn){
        TempEnName.sendKeys(TempEn);
    }

    private void insertTempArName(String TempAr){
        TempEnName.sendKeys(TempAr);
    }

    private void CheckonDefaultBox(){
        DefaulTempCheckbox.click();
    }

    private void ClickonSave(){
        SaveBtn.click();
    }
}
