import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Leortis on 6/22/16.
 */
@RunWith(Parameterized.class)

public class ParametrizedTest extends BaseTest{
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"vasyl.kyrychuk@gmail.com", "Lingualeo_123"},
                {"vasyl.kyrychuk@gmail.com", ""},
                {"", "Lingualeo_123"},
                {"", ""}
        });
    }
    private String tLogin;
    private String tPass;

    public ParametrizedTest (String login, String pass){
        this.tLogin = login;
        this.tPass = pass;
    }

    @Test
    public void ParametrizedTest() {
        login.loginTo(tLogin, tPass);
        Assert.assertTrue("Incorrect login or password", welcomePage.loginText().contains("Привет"));
    }

}
