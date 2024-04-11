package automatizado.test;

import static org.junit.Assert.assertTrue;

import automatizado.page.GooglePO;
import org.junit.BeforeClass;
import org.junit.Test;

public class GoogleTest extends BaseTest {

  private static GooglePO googlePage;

  
  @BeforeClass
  public static void prepararTestes() {
    googlePage = new GooglePO(driver);
  }

  @Test
  public void TC001_deveSerPossivelPesquisarNoGoogleOTextoBatataFrita() {
    try {
      Thread.sleep(5000); // 5000 milissegundos = 5 segundos
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    googlePage.pesquisar("Pesquisar");

    googlePage.selecaoVideo.click();
  }
}
