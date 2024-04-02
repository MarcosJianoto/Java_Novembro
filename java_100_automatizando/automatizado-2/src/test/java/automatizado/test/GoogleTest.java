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
    googlePage.pesquisar("Batata frita");

    String resultado = googlePage.obterResultadoDaPesquisa();
    assertTrue(resultado, resultado.contains("Aproximadamente"));
  }

  @Test
  public void TC002_deveSerPossivelPesquisarNoGoogleOTextoNutella() {
    googlePage.pesquisar("Nutella");

    String resultado = googlePage.obterResultadoDaPesquisa();

    assertTrue(resultado, resultado.contains("resultados"));
  }
}
