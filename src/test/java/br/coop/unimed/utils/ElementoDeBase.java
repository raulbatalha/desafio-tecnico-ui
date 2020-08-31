package br.coop.unimed.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static br.coop.unimed.navegador.ConfiguracaoDoNavegador.waitSelenium;

public class ElementoDeBase extends BaseDeConfiguracao {
    public String getChromePath() {
        configuracaoLeitura();
        return propriedade.getProperty("ChromePath");
    }

    public String getBaseURL() {
        return propriedade.getProperty("BaseURL");
    }

    public String getOutrosElementos(String elementos) {
        return propriedade.getProperty(elementos);
    }

    public void esperaDoCampoDePesquisa() {
        waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(By.id(getOutrosElementos("esperaDoCampoPesquisa"))));
    }

    public void esperaDoEstado() {
        waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(By.id(getOutrosElementos("esperaDoEstado")))).click();
    }

    public void esperaDaCidade() {
        waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(By.id(getOutrosElementos("esperaDaCidade")))).click();
    }

    public void esperaRadioButton() {
        waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getOutrosElementos("esperaRadioButton"))));
    }

    public void esperaDoTexto() {
        waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(getOutrosElementos("esperaDoTexto"))));
    }
}