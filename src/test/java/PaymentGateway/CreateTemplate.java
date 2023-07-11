package PaymentGateway;

import WebPages.Dashboard;
import WebPages.LoginPage;
import WebPages.PLPage;
import WebPages.TemplatePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CreateTemplate extends BaseTest{
    WebDriver driver;
    Dashboard dashboard;

    TemplatePage templatePage;
    ChromeOptions options = new ChromeOptions();

    @Test
    public void CreateTemplate(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome Driver\\chromedriver.exe");
        driver.get("https://paygatetst.cashcall.com.eg/merchantportal/merchant?lang=en");
        driver.manage().window().maximize();


        loginPage = new LoginPage(this.driver);
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dashboard = loginPage.LoginAsAMerchant("zmohamed","ZeyadMohamed@12345");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        templatePage = dashboard.NavigatetoCreateTemplate();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        templatePage.insertTempEnName("automationn");
        templatePage.insertTempArName("اوتومايشنن");
        templatePage.CheckonDefaultBox();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        templatePage.ClickonSave();
    }

}
