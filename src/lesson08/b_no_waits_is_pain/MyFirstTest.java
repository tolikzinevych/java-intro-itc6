package lesson08.b_no_waits_is_pain;

import java.util.concurrent.TimeUnit;

import org.hamcrest.CoreMatchers;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

  static WebDriver driver;

  @BeforeClass
  public static void setUp() {
    driver = new ChromeDriver();

    driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    driver.get("http://automationpractice.com/index.php");
  }

  @AfterClass
  public static void tearDown() {
    driver.quit();
  }

  // Without any waits the test fails cause drop-down tip can't appear in time
  @Test(timeout = 5000l)
  public void verifyFirstTipIsCorrect() {
    driver.findElement(By.id("search_query_top"))
            .clear();
    driver.findElement(By.id("search_query_top"))
            .sendKeys("Dress");

    Assert.assertThat(
            driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]"))
                    .getText(),
            CoreMatchers.containsString("Dress"));
  }
}