import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class MailCheckerTest extends TestBase{


    @Test
    public void gmailTest() {
//        driver.get("https://accounts.google.com/");
        driver.get("https://mail.google.com/");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("litstest721@gmail.com");
        driver.findElement(By.xpath("//div[@role=\"button\"][@id=\"identifierNext\"]")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type=\"password\"]")));
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("lits24test");
        driver.findElement(By.xpath("//div[@role=\"button\"][@id=\"passwordNext\"]")).click();

    }
//    litstest721@gmail.com


}
