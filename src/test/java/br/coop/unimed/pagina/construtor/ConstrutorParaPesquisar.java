package br.coop.unimed.pagina.construtor;

import br.coop.unimed.navegador.ConfiguracaoDoNavegador;
import br.coop.unimed.pagina.elementos.ElementosParaPesquisar;
import org.openqa.selenium.support.PageFactory;

public class ConstrutorParaPesquisar extends ConfiguracaoDoNavegador {
    ElementosParaPesquisar construtorDePesquisa = null;

    public void pesquisarEstado(String estado) {
        construtorDePesquisa = PageFactory.initElements(driverSelenium, ElementosParaPesquisar.class);
        construtorDePesquisa.clickEstado(estado);
    }

    public void pesquisarCidade(String cidade) {
        construtorDePesquisa = PageFactory.initElements(driverSelenium, ElementosParaPesquisar.class);
        construtorDePesquisa.clickCidade(cidade);
    }

    public void marcarRadioButton() {
        construtorDePesquisa = PageFactory.initElements(driverSelenium, ElementosParaPesquisar.class);
        construtorDePesquisa.clickRadioButton();
    }

    public void botaoContinuar() {
        construtorDePesquisa = PageFactory.initElements(driverSelenium, ElementosParaPesquisar.class);
        construtorDePesquisa.clickBotaoContinuar();
    }
}