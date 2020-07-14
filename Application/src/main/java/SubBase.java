import pageobject.AccountPage;
import java.io.IOException;

public class SubBase extends Base {

    public String testDataFilePath = "C:\\Users\\iamam\\Desktop\\BunPro\\Application\\src\\test\\TestData\\test_data.xlsx";
    public String username = readFromExcel(testDataFilePath, "Account", "B2");
    public String password = readFromExcel(testDataFilePath, "Account", "C2");

    public SubBase() throws IOException { }

    public void loginToAccount() throws InterruptedException {
        clickByXpath(AccountPage.loginLinkXpath);
        sendTextByXpath(AccountPage.usernameFieldXpath, username);
        enterKeyXpath(AccountPage.usernameFieldXpath);
        sendTextByXpath(AccountPage.passwordFieldXpath, password);
        clickByXpath(AccountPage.signInButtonXpath);
    }
}
