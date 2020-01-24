import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTest {

    private By searchfield = By.xpath("//input[contains(@name,'q')]");
    private By txtFacebookPage = By.xpath("//h3[contains(@class, 'LC20lb')]");
    private By emailFacebook = By.xpath("//input[contains(@name,'email')]");
    private By passFacebook = By.xpath("//input[contains(@name,'pass')]");
    private By loginBtn = By.xpath("//input[@id='u_0_b']");

    @Test
    public void simpleTest() {
        WebDriver driver = DriverManager.getDriver();
        driver.navigate().to("https://www.google.com");
        DriverManager.getDriver().findElement(searchfield).click();
        DriverManager.getDriver().findElement(searchfield).sendKeys("Facebook" + Keys.ENTER);
        DriverManager.getDriver().findElement(txtFacebookPage).click();

        DriverManager.getDriver().findElement(emailFacebook).click();
        DriverManager.getDriver().findElement(emailFacebook).sendKeys("badlogin");

        DriverManager.getDriver().findElement(passFacebook).click();
        DriverManager.getDriver().findElement(passFacebook).sendKeys("badpassword");

        DriverManager.getDriver().findElement(loginBtn).click();

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@//div[contains(@role,'alert')]")));
        DriverManager.getDriver().findElement(By.xpath("//div[contains(@role,'alert')]")).click();


    }
}
