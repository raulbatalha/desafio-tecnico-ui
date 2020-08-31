package br.coop.unimed.pagina.elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElementosDaPaginaDePesquisa {

    @FindBy(css = "[href='https://www.unimed.coop.br/guia-medico']")
    @CacheLookup
    private WebElement quiaMedico;

    @FindBy(id = "campo_pesquisa")
    @CacheLookup
    private WebElement campoPesquisa;

    @FindBy(id = "btn_pesquisar")
    @CacheLookup
    private WebElement botaoPesquisar;

    @FindBy(xpath = "//a[@class='proximo']")
    private WebElement botaoProximo;

    public void clickGuiaMedico() {
        quiaMedico.click();
    }

    public void clickCampoPesquisa(String nomeDaPesquisa) {
        campoPesquisa.sendKeys(nomeDaPesquisa);
    }

    public void clickNoBotaoPesquisar() {
        botaoPesquisar.click();
    }

    public void clickBotaoProximo(){
        botaoProximo.click();
    }
}