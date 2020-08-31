package br.coop.unimed.pagina.elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementosParaPesquisar {
    @FindBy(id = "react-select-2-input")
    private WebElement elementoEstado;

    @FindBy(id = "react-select-3-input")
    private WebElement elementoCidade;

    @FindBy(xpath = "//form[@class='form-escolher-unimed-gm']")
    private WebElement radioButton;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement botaoContinuar;

    public void clickEstado(String estado) {
        elementoEstado.sendKeys(estado);
    }

    public void clickCidade(String cidade) {
        elementoCidade.sendKeys(cidade);
    }

    public void clickRadioButton() {
        radioButton.isSelected();
        radioButton.click();
    }

    public void clickBotaoContinuar() {
        botaoContinuar.click();
    }
}