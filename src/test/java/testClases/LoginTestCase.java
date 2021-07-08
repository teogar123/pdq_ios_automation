package testClases;

import PageObjects.LoginPage;
import bases.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseTest {
    private LoginPage loginPage;


    @BeforeClass(alwaysRun = true)
    public void loginTestStart() {
        this.loginPage = new LoginPage(this.driver);
    }

    @Test
    public void tc_loginApp() throws InterruptedException {
        loginPage.loginFlow();
    }

}
