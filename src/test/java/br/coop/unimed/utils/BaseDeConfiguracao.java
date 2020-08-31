package br.coop.unimed.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseDeConfiguracao {
    public static Properties propriedade;

    public static void configuracaoLeitura() {
        try {
            File solicitacaoDeArquivo = new File("src/configuracao/configuracao.property");
            FileInputStream entradaDeArquivo = new FileInputStream(solicitacaoDeArquivo);
            propriedade = new Properties();
            propriedade.load(entradaDeArquivo);
        } catch (Exception e) {
            System.out.println("Erro de excecao: " + e.getMessage());
        }
    }
}