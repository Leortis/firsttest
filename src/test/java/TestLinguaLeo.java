import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Leortis on 6/15/16.
 */
public class TestLinguaLeo {
    public static void main (String[] args){
        WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.get("http://lingualeo.com/ru");
        LoginPage loginPage = new LoginPage(webDriver);
        WelcomePage welcomePage = new WelcomePage(webDriver);
        loginPage.loginTo("vasyl.kyrychuk", "Lingualeo_123");
        welcomePage.loginText();

    }

}
