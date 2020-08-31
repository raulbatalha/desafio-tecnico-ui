package br.coop.unimed.suite_de_teste;

import br.coop.unimed.pagina.construtor.ConstrutorDaPaginaDePesquisa;
import br.coop.unimed.utils.ElementoDeBase;
import cucumber.api.java.After;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static br.coop.unimed.navegador.ConfiguracaoDoNavegador.driverSelenium;

public class CT002_ValidarPagina123 {
    private List<WebElement> listaDeEspecialidade;
    private List<WebElement> listaDaCidade;

    ElementoDeBase elementos = new ElementoDeBase();
    ConstrutorDaPaginaDePesquisa elementosDePesquisa = new ConstrutorDaPaginaDePesquisa();

    @Entao("^Validar a apresentação dos resultados com a \"([^\"]*)\" e \"([^\"]*)\"\\.$")
    public void validarAApresentaçãoDosResultadosComAE(String especialidade, String cidade) {
        elementos.esperaDoTexto();
        elementosDePesquisa.barraDeRolagem();
        elementosDePesquisa.botaoProximo();
        elementosDePesquisa.barraDeRolagem();
        elementosDePesquisa.botaoProximo();
        elementosDePesquisa.barraDeRolagem();

        listaDeEspecialidade = driverSelenium.findElements(By.xpath(elementos.getOutrosElementos("especialidade")));
        Assert.assertEquals(true, listaDeEspecialidade.contains(especialidade));

        listaDaCidade = driverSelenium.findElements(By.xpath(elementos.getOutrosElementos("cidade")));
        Assert.assertEquals(false, listaDaCidade.contains(cidade));
    }

    @After(order = 1)
    public static void tearDown() {
        driverSelenium.close();
    }
}