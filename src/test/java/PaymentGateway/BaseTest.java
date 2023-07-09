package PaymentGateway;

import WebPages.LoginPage;
import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import WebPages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;
    private ChromeOptions options = new ChromeOptions();

    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        options.addArguments("--remote-allow-origins=*");
        driver.get("https://paygatetst.cashcall.com.eg/merchantportal/merchant?lang=en");
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
    }

    public void hold(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
