package br.coop.unimed.pagina.construtor;

import br.coop.unimed.navegador.ConfiguracaoDoNavegador;
import br.coop.unimed.pagina.elementos.ElementosDaPaginaDePesquisa;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ConstrutorDaPaginaDePesquisa extends ConfiguracaoDoNavegador {
    ElementosDaPaginaDePesquisa construtorDosElementos = null;

    public void guiaMedico() {
        construtorDosElementos = PageFactory.initElements(driverSelenium, ElementosDaPaginaDePesquisa.class);
        construtorDosElementos.clickGuiaMedico();
    }

    public void campoDePesquisa(String nomeDaPesquisa) {
        construtorDosElementos = PageFactory.initElements(driverSelenium, ElementosDaPaginaDePesquisa.class);
        construtorDosElementos.clickCampoPesquisa(nomeDaPesquisa);
    }

    public void botaoDePesquisar() {
        construtorDosElementos = PageFactory.initElements(driverSelenium, ElementosDaPaginaDePesquisa.class);
        construtorDosElementos.clickNoBotaoPesquisar();
    }

    public void botaoProximo() {
        construtorDosElementos = PageFactory.initElements(driverSelenium, ElementosDaPaginaDePesquisa.class);
        construtorDosElementos.clickBotaoProximo();
    }

    public void barraDeRolagem() {
        WebElement menuLista = driverSelenium.findElement(By.cssSelector("[href='#lista_por']"));
        Actions actions = new Actions(driverSelenium);
        actions.sendKeys(Keys.END).perform();
        actions.moveToElement(menuLista).click().perform();
    }
}