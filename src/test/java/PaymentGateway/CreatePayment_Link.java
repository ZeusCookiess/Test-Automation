package PaymentGateway;

import WebPages.Dashboard;
import WebPages.LoginPage;
import WebPages.PLPage;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class CreatePayment_Link extends BaseTest{

    WebDriver driver;
    Dashboard dashboard;
    BaseTest baseTest;
    PLPage plPage;
    ChromeOptions options = new ChromeOptions();

   /* @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome Driver\\chromedriver.exe");
        driver.get("https://paygatetst.cashcall.com.eg/merchantportal/merchant?lang=en");
        driver.manage().window().maximize();
    }*/

    @Test
    public void createPaymentLink(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome Driver\\chromedriver.exe");
        driver.get("https://paygatetst.cashcall.com.eg/merchantportal/merchant?lang=en");
        driver.manage().window().maximize();


        loginPage = new LoginPage(this.driver);
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dashboard = loginPage.LoginAsAMerchant("zmohamed","ZeyadMohamed@12345");
        plPage = dashboard.NavigatetoCreatePaymenLink();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        plPage.insertAmount("100");
        plPage.sendEmail();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        plPage.insertEmail("zeyad.mohamed@cashcall.com.eg");
        plPage.pressSend();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        plPage.pressConfirm();

    }


    /*@AfterClass
    public void Teardown(){
        driver.quit();
    }*/



}
