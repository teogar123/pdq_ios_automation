package PageObjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(30)), this);
    }


   @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login\"]\n")
   public WebElement loginButton;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"PDQ Smart\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField\n")
    public WebElement emailField;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"PDQ Smart\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeSecureTextField")
    public WebElement passwordField;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Continue\"]")
    public WebElement submitButton;

    public void loginFlow() throws InterruptedException {

        this.loginButton.click();
        List<WebElement>  elementList = Arrays.asList(this.emailField, this.passwordField);
        //elementList.forEach(ele -> ele.isDisplayed());
        this.emailField.sendKeys("teodoro.garcia@delphiansystems.com");
        this.passwordField.sendKeys("Tester@22");
        this.submitButton.click();
        Thread.sleep(5000);

    }
}
