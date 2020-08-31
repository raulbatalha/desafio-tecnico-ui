**Deve ser criado um novo projeto Java na IDE que preferir copie a pasta Source [src] e substitua do seu novo projeto criado.**
**Agora é só rodar e pronto!**



**Antes de executar o projeto deve ser desativado o GPS do Navegador Chrome da Seguinte maneira:**

*1º. Abra o menu de configurações do navegador do Chrome.*

*2º. Vá até a parte inferior e clique em “Mostrar configurações avançadas”.*

*3º. Em seguida, localize a aba “Privacidade” e clique em “Configurações de conteúdo”.*

*4º. Uma nova janela se abrirá.*

*5º. Em “Localização”, e clique em “Não permitir que sites rastreiem minha posição”*


**file: pom.xml**
    
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.7</version>
        </dependency>