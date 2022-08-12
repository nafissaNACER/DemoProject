package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetupTeardown {

    public String baseUrl = "https://www.avito.ma/";
    String driverPath = "C:\\Users\\nnacer\\Tools\\drivers\\chromeDriver\\chromedriver.exe";
    public static WebDriver driver;

    @AfterMethod
    public void terminateBrowser() {
        driver.close();
    }


    @BeforeMethod
    public void launchBrowser() {
        System.out.println("launching Chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @BeforeTest
    public void lanchSuite() {
        System.out.println("Before suite");
    }

    @AfterTest
    public void FinSuite() {
        System.out.println("after suite");
    }
}
