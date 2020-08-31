package br.coop.unimed.executor;

import br.coop.unimed.navegador.ConfiguracaoDoNavegador;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/br/coop/unimed/definicao_dos_testes",
        glue = "br/coop/unimed/suite_de_teste",
        plugin = {"pretty", "html:src/reports/report.html"},
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
)

public class ExecutarTeste extends ConfiguracaoDoNavegador {
}