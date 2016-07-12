import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Leortis on 6/22/16.
 */
public class BaseTest {
    WebDriver driver;
    LoginPage login;
    WelcomePage welcomePage;

    @Before
    public void preconfig () {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://lingualeo.com/ru");
        login = new LoginPage(driver);
        welcomePage = new WelcomePage(driver);
    }

    @After
    public void tearDown () {
        if (driver != null)
            driver.quit();
    }
}
