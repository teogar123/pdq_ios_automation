package bases;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class BaseTest {

    protected IOSDriver<WebElement> driver;

    @BeforeClass
    public void setUp () {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("platformName", "iOS");
            caps.setCapability("platformVersion", "14.6");
            caps.setCapability("deviceName", "iPhone de Teddy");
            caps.setCapability("udid", "d201013048679bfd73ed9de9924c0934f74f64ac");
            caps.setCapability("automationName", "XCUITest");
            caps.setCapability("bundleId", "com.belwith.PDQSmart");
            caps.setCapability("xcodeOrgId", "PDQ Industries, Inc");
            caps.setCapability("xcodeSigningId", "Developer");

            URL url = new URL ("http://127.0.0.1:4723/wd/hub");
            this.driver = new IOSDriver<>(url , caps);
            //Thread.sleep(3000);

        } catch (Exception exp) {
            System.out.println("The Cause is : " + exp.getCause());
            System.out.println("The Message is : " + exp.getLocalizedMessage());
        }
    }

    @Test
    public void runTest() {
        System.out.println("Start");
    }


    @AfterMethod
    public void tearDown() {
        System.out.println("Killing IOS Appium Instance");
        this.driver.quit();
    }

};

