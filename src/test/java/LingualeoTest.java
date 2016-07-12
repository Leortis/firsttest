import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Leortis on 6/22/16.
 */
public class LingualeoTest extends BaseTest {
    @Test
    public void testLogin (){
        login.loginTo("vasyl.kyrychuk@gmail.com", "Lingualeo_123");
        Assert.assertTrue("Exists", welcomePage.loginText().contains("Привет"));
    }
}




 //   public void testGetRightSideNews () {
 //       Assert.assertNotNull("Error in verification of 1st news", main.printNewsTextByIndex(1));
 //   }


