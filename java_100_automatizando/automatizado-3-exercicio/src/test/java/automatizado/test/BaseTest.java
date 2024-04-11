package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseTest {

  public static WebDriver driver;
  public static WebDriverWait wait;
  private static final String URL_BASE = "https://www.youtube.com/";
  private static final String CAMINHO_DRIVER =
    "src/test/java/automatizado/resources/chromedriver123.exe ";

  @BeforeClass
  public static void iniciar() {
    System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(URL_BASE);
  }
  // @AfterClass
  // public static void finalizar() {
  //   driver.quit();
  // }
}
