import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class AccountFeature extends SubBase {

    public AccountFeature() throws IOException { }

    @Test
    (priority = 1, enabled = true)
    public void login() throws Exception {
        try {
            loginToAccount();
            Assert.assertEquals("dashboard", "dashboard");
        }catch (Exception e) {
            snapScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
            Assert.fail();
        }
    }

}
