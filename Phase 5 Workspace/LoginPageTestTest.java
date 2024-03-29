// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginPageTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginPageTest() {
    driver.get("http://127.0.0.1:5500/login.html");
    driver.manage().window().setSize(new Dimension(1056, 800));
    driver.findElement(By.id("n1")).sendKeys("raj@gmail.com");
    {
      WebElement element = driver.findElement(By.id("n1"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("n2")).sendKeys("1234");
    driver.findElement(By.id("b1")).click();
    assertThat(driver.switchTo().alert().getText(), is("failure try once again"));
    driver.findElement(By.id("n2")).click();
    assertThat(driver.switchTo().alert().getText(), is("failure try once again"));
    driver.findElement(By.id("n2")).sendKeys("123");
    driver.findElement(By.id("b1")).click();
    assertThat(driver.switchTo().alert().getText(), is("successfully login"));
  }
}
