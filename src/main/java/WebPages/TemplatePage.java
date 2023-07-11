package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TemplatePage {

    WebDriver driver;

    @FindBy(id = "templateEnName")
    WebElement TempEnName;

    @FindBy(id = "templateArName")
    WebElement TempArName;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div/app-create-payment-link-template/form/div[1]/div/div/div/div[4]/span/div/p-checkbox/div/div[2]")
    WebElement DefaulTempCheckbox;

    @FindBy(xpath = "/html/body/app-root/app-main/div/div/div/app-create-payment-link-template/form/div[2]/div[1]/button")
    WebElement SaveBtn;

    @FindBy(xpath = "/html/body/app-root/app-main/div/app-menu/div/ul/li[4]/ul/li[1]")
    WebElement CreateTemp;

    public TemplatePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void insertTempEnName(String TempEn){
        TempEnName.sendKeys(TempEn);
    }

    public void insertTempArName(String TempAr){
        TempArName.sendKeys(TempAr);
    }

    public void CheckonDefaultBox(){
        DefaulTempCheckbox.click();
    }

    public void ClickonSave(){
        SaveBtn.click();
    }
}
