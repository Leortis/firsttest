import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Leortis on 6/15/16.
 */
public class WelcomePage extends BasePage {
    @FindBy(xpath = "//h3")
    public WebElement wordHello;

    public WelcomePage (WebDriver driver){
        super(driver);
    }

    public String loginText() {
        String text = wordHello.getText();
        return text;

       }
    }

