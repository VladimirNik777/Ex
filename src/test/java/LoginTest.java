import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class LoginTest {

    /**
     * Preconditions:
     * - open browser
     * - clean cookies
     *
     * Scenario:
     * - navigate to http://linkedin.com
     * - verify url
     *      - (login page is loaded)
     *      - verify page title ()
     *      - verify button "sign-in"
     * - enter user email into userEmail field
     * - enter user password into userPassword field
     * - click button "sign-in"
     * - verify ../feed is loaded
     *
     * Postconditions:
     * - close browser
     */
    @Test
    public void successfulLoginTest() throws InterruptedException {
        //System.out.println("Test is running");
        String url = "https://www.linkedin.com/";
        String errorMsg = "Home page URL is wrong";

        WebDriver webDriver = new FirefoxDriver();
        webDriver.navigate().to(url);
        //webDriver.get("https://www.linkedin.com");

        Assert.assertEquals(webDriver.getCurrentUrl(), url, errorMsg);

        webDriver.quit();
    };
}
