package br.coop.unimed.suite_de_teste;

import br.coop.unimed.navegador.ConfiguracaoDoNavegador;
import br.coop.unimed.pagina.construtor.ConstrutorDaPaginaDePesquisa;
import br.coop.unimed.pagina.construtor.ConstrutorParaPesquisar;
import br.coop.unimed.utils.ElementoDeBase;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CT001_ValidarPesquisarMedico extends ConfiguracaoDoNavegador {
    private List<WebElement> listaDeEspecialidade;
    private List<WebElement> listaDaCidade;

    ElementoDeBase elementos = new ElementoDeBase();
    ConstrutorParaPesquisar elementosParaPesquisar = new ConstrutorParaPesquisar();
    ConstrutorDaPaginaDePesquisa elementosDePesquisa = new ConstrutorDaPaginaDePesquisa();

    @Dado("^que desejo acessar Guia Médico na pagina da Unimed Cooperado!$")
    public void queDesejoAcessarGuiaMédicoNaPaginaDaUnimedCooperado() {
        configuracaoDoNavegador();
        elementosDePesquisa.guiaMedico();
    }

    @Quando("^realizar uma pesquisa de Médicos no \"([^\"]*)\"$")
    public void realizarUmaPesquisaDeMédicosNo(String nomeDaPesquisa) {
        elementos.esperaDoCampoDePesquisa();
        elementosDePesquisa.campoDePesquisa(nomeDaPesquisa);
        elementosDePesquisa.botaoDePesquisar();
        elementosParaPesquisar.pesquisarEstado(nomeDaPesquisa);
        elementos.esperaDoEstado();
        elementosParaPesquisar.pesquisarCidade(nomeDaPesquisa);
        elementos.esperaDaCidade();
        elementos.esperaRadioButton();
        elementosParaPesquisar.marcarRadioButton();
        elementosParaPesquisar.botaoContinuar();
    }

    @Entao("^Validar a apresentação dos resultados com a \"([^\"]*)\" e \"([^\"]*)\"$")
    public void validarAApresentaçãoDosResultadosComAE(String especialidade, String cidade) {
        elementos.esperaDoTexto();

        listaDeEspecialidade = driverSelenium.findElements(By.xpath(elementos.getOutrosElementos("especialidade")));
        Assert.assertEquals(true, listaDeEspecialidade.contains(especialidade));

        listaDaCidade = driverSelenium.findElements(By.xpath(elementos.getOutrosElementos("cidade")));
        Assert.assertEquals(true, listaDaCidade.contains(cidade));
    }

    @After(order = 0)
    public static void tearDown() {
        driverSelenium.close();
    }
}