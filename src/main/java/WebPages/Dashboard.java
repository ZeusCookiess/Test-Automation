package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    WebDriver driver;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/app-root/app-main/div/app-menu/div/ul/li[5]/ul/li[2]/a")
    private WebElement CreatePLBtn;

    @FindBy(xpath = "/html/body/app-root/app-main/div/app-menu/div/ul/li[4]/ul/li[1]/a")
    private WebElement CreateTemplateBtn;



    public PLPage NavigatetoCreatePaymenLink(){
    CreatePLBtn.click();
    return new PLPage(driver);
    }

    public TemplatePage NavigatetoCreateTemplate(){
        CreateTemplateBtn.click();
        return new TemplatePage(driver);
    }
}
