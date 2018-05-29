import common.WebDriverFactory;
import enums.BrowserEnum;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(@Optional("CHROME")BrowserEnum browser) {
        driver = new WebDriverFactory(browser).getWebdriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
