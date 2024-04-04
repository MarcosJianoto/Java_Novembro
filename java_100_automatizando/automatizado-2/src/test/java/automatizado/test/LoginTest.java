package automatizado.test;

import static org.junit.Assert.assertEquals;

import automatizado.page.LoginPO;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {

  private static LoginPO loginPage;

  @FindBy(id = "btn-adicionar")
  public WebElement btnCriar;

  private void executarAcaoDeLogar(String email, String senha) {
    loginPage.escrever(loginPage.inputEmail, email);
    loginPage.escrever(loginPage.inputSenha, senha);

    loginPage.buttonEntrar.click();
  }

  @BeforeClass
  public static void prepararTestes() {
    loginPage = new LoginPO(driver);
  }

  @Test
  public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazios() {
    executarAcaoDeLogar("", "");
    String mensagem = loginPage.obterMensagem();

    String mensagemEsperada =
      "Informe usuário e senha, os campos não podem ser brancos.";

    assertEquals(mensagem, mensagemEsperada);
  }

  @Test
  public void TC002_naoDeveLogarNoSistemaComEmailIncorretoESenhaVazia() {
    executarAcaoDeLogar("email", "");
    String mensagem = loginPage.obterMensagem();

    String mensagemEsperada =
      "Informe usuário e senha, os campos não podem ser brancos.";

    assertEquals(mensagem, mensagemEsperada);
  }

  @Test
  public void TC003_naoDeveLogarNoSistemaComEmailVazioESenhaIncorreta() {
    executarAcaoDeLogar("", "senha");
    String mensagem = loginPage.obterMensagem();

    String mensagemEsperada =
      "Informe usuário e senha, os campos não podem ser brancos.";

    assertEquals(mensagem, mensagemEsperada);
  }

  @Test
  public void TC007_DeveLogarNoSistemaComEmailESenhaCorretos() {
    executarAcaoDeLogar("admin@admin.com", "admin@123");

    assertEquals(loginPage.obterTituloPagina(), "Controle de Produtos");
  }
}
