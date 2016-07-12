import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Leortis on 6/15/16.
 */
//Lingualeo_123
public class LoginPage extends BasePage {
    @FindBy(id = "headEnterBtn")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@class='simple-dialog__inner']/descendant::form[@id='loginForm']/descendant::input[@type='email']")
    public WebElement loginEmail;
    @FindBy(xpath = "//div[@class='simple-dialog__inner']/descendant::form[@id='loginForm']/descendant::input[@type='password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//div[@class='simple-dialog__inner']/descendant::form[@id='loginForm']/descendant::button[@data-element='send']")
    public WebElement loginSubmitCredentials;

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public void loginTo (String emailLogin, String passwordLogin){
        loginButton.click();
        loginEmail.sendKeys(emailLogin);
        loginPassword.sendKeys(passwordLogin);
        loginSubmitCredentials.click();
    }




}
