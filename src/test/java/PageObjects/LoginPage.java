package PageObjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(30)), this);
    }

   @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login\"]\n")
   public WebElement loginButton;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"PDQ Smart\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField\n")
    public WebElement emailField;

    public void loginFlow() throws InterruptedException {
        loginButton.click();
        emailField.sendKeys("fasasafasfsa");
        Thread.sleep(4000);

    }
}
