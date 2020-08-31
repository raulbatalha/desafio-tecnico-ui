package br.coop.unimed.navegador;

import br.coop.unimed.utils.ElementoDeBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfiguracaoDoNavegador {

    public static WebDriver driverSelenium = null;
    public static WebDriverWait waitSelenium = null;
    public static ElementoDeBase configurcaoDeDados;

    public static void configuracaoDeBase() {
        configurcaoDeDados = new ElementoDeBase();
        System.setProperty("webdriver.chrome.driver", configurcaoDeDados.getChromePath());
        driverSelenium = new ChromeDriver();
        waitSelenium = new WebDriverWait(driverSelenium, 10);
    }

    public static void configuracaoDoNavegador() {
        configuracaoDeBase();
        driverSelenium.get(configurcaoDeDados.getBaseURL());
        driverSelenium.manage().window().maximize();
    }
}