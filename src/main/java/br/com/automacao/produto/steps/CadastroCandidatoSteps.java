package br.com.automacao.produto.steps;

import br.com.automacao.produto.core.Driver;
import br.com.automacao.produto.pages.LoginPage;
import br.com.automacao.produto.pages.CadastroCandidatoPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import static org.junit.Assert.assertEquals;

public class CadastroCandidatoSteps {

    private CadastroCandidatoPage cadastrocandidatopage = new CadastroCandidatoPage();
    LoginPage loginpage = new LoginPage();


    @Dado("^que esteja na pagina \"([^\"]*)\"$")
    public void queEstejaNaPagina(String url) throws Throwable {
        Driver.abreNavegador();
        Driver.driver.get(url);
    }

    @Dado("^que eu acesse a página da VV Test$")
    public void queEuAcesseAPáginaDaVVTest() throws Throwable {
        assertEquals(cadastrocandidatopage.getHome(), "VV Test");
    }

    @Dado("^acesse o menu \"([^\"]*)\"$")
    public void acesseOMenu(String menu) throws Throwable {
        cadastrocandidatopage.clickMenu(menu);
    }

    @Quando("^eu preencher todos os campos obrigatorios$")
    public void euPreencherTodosOsCamposObrigatorios() throws Throwable {
        cadastrocandidatopage.setInpNome("Cícero")
                .setSobreNome("Marcelo da Silva")
                .setEmail("ciceromarc@gmail.com")
                .setEmailConfirmacao("ciceromarc@gmail.com")
                .clickIdade()
                .slcTempoArea("mais de 5 anos")
                .slcAtraiu("Desafio")
                .clickRadMelhoria()
                .setLinguagem("Java")
                .clickEnviar();
    }

    @Entao("^deve ser direcionado para uma pagina de sucesso$")
    public void deveSerDirecionadoParaUmaPaginaDeSucesso() throws Throwable {
        assertEquals(cadastrocandidatopage.getSucesso(), "Your form has been successfully submitted.");
        Driver.fechaNavegador();
    }
}
