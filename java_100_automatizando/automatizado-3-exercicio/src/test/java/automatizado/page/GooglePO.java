package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {

  // @FindBy(id = "search")
  // public WebElement inputPesquisa;

  // @FindBy(id = "result-stats")
  // public WebElement divResultadoPesquisa;

  @FindBy(id = "#search")
  public WebElement inputPesquisa;

  @FindBy(css = "#thumbnail > yt-image > img")
  public WebElement selecaoVideo;

  /**
   * Construtor para criação da pagina do Google.
   * @param driver Driver da página do Google.
   */
  public GooglePO(WebDriver driver) {
    super(driver);
  }

  /**
   * Método que irá efetuar uma pesquisa no Google baseando no texto informado e concluindo com enter.
   * @param texto texto a ser pesquisado
   */
  public void pesquisar(String texto) {
    inputPesquisa.sendKeys(texto + Keys.ENTER);
  }

  /**
   * método que retorna o resultado aproximado da pesquisa.
   * @return retorna o resultado da pesquisa.
   */
  // public String obterResultadoDaPesquisa() {
  //   return divResultadoPesquisa.getText();
  // }

  public void clicarVideo() {
    return;
  }
}
