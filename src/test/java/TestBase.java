import common.WebDriverFactory;
import enums.BrowserEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    WebDriverWait webDriverWait = new WebDriverWait(driver, 5);


    @Parameters("browser")
    @BeforeClass
    public void setup(@Optional("CHROME")BrowserEnum browser) {
        driver = new WebDriverFactory(browser).getWebdriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
