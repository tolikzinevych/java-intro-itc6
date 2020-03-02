package lesson08.f_explicit_wairts_work_with_proxy_elements;

import java.util.concurrent.TimeUnit;

import org.hamcrest.CoreMatchers;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {

  static WebDriver driver;

  @BeforeClass
  public static void setUp() {
    driver = new ChromeDriver();

    driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // don't mix implicit and explicit waits
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    driver.get("http://automationpractice.com/index.php");
  }

  @AfterClass
  public static void tearDown() {
    driver.quit();
  }

  @Test
  public void verifyFirstTipIsCorrectlyUpdatedAfterEnteringNewQuery() {
    driver.findElement(By.id("search_query_top"))
            .clear();
    driver.findElement(By.id("search_query_top"))
            .sendKeys("Dress");

    WebElement firstTip = (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]")));

    Assert.assertThat(firstTip.getText(),
            CoreMatchers.containsString("Dress"));

    driver.findElement(By.id("search_query_top"))
            .clear();
    driver.findElement(By.id("search_query_top"))
            .sendKeys("T-shirt");

    firstTip = driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]"));
    // be careful with expectedConditions that have WebElement as a parameter, they should be lazy-proxy
    (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.textToBePresentInElement(firstTip, "T-shirt"));

    Assert.assertThat(
            firstTip.getText(),
            CoreMatchers.containsString("T-shirt"));
  }

}