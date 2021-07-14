AvaliacaoVia
Como executar via ide Junit:

Importar na ide de preferencia o projeto como maven java
Abrir o arquivo RunnerTest.java e executar via Junit
2.1 Ou executar o projeto como Junit

Como executar via cucumber feature:

selecionar o arquivo em src/test/resources/feature/
executar como cucumber feature
Como executar via linha de comando utilizando maven(necessario ter o maven configurado na maquina):

Abrir o terminal no diretorio do projeto
Executar o comando: mvn test
Como executar via linha de comando utilizando maven, para gerar relatorio(necessario ter o maven configurado na maquina):

Abrir o terminal no diretorio do projeto
Executar o comando: mvn install
Estrutura do Projeto
Pacotes:

Core:
Pacote responsavel pela parte do core da automação, como acesso ao driver e ações dos elementos

Enums:
Pacote responsavel para guardar qualquer Enum que seja necessário criar

Maps:
Pacote responsavel pela parte dos mapeamentos dos campos, onde os objetos dos campos são instanciadas utilizando a classe Element de core

Pages:
Pacote responsavel pela parte das ações das paginas, como preenchimento, cliques, retornos de conteudos.

Runner:
Pacote responsavel pela parte das classes de execuções utilizando JUnit e RunWith Cucumber.class

Steps:
Pacote responsavel para guardar as Classes de Steps, as quais são geradas pelo cucumber. Nessas classes são chamadas as ações das paginas
Através das pages e validações.

features:
Diretório responsável para guardar os arquivos .feature, onde estão gravados os arquivos relacionados ao cucumber e as escrita em gherkin