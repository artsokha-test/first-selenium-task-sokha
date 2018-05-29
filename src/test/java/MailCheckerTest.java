import org.testng.annotations.Test;


public class MailCheckerTest extends TestBase{


    @Test
    public void gmailTest() {
        driver.get("https://www.google.com/gmail/about/");
    }



}
