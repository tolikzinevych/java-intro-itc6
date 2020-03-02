package lesson08.a_first_test;

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
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    driver.get("http://automationpractice.com/index.php");
  }

  @AfterClass
  public static void tearDown() {
    driver.quit();
  }

  // Using of assertTrue isn't useful for different comparison
  // in fails you should check what was expected and actual results
  @Test(timeout = 5000l)
  public void verifyFirstTipIsCorrect_viaAssertTrue() {
    driver.findElement(By.id("search_query_top"))
            .clear();
    driver.findElement(By.id("search_query_top"))
            .sendKeys("Dress");

    Assert.assertTrue("First tip text was wrong",
            driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]"))
                    .getText().contains("Dress1"));
  }

  // More useful is assertThat with correspondent matcher then you will see expected and actual parts
  // For more details and overview existing matchers: http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/CoreMatchers.html
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