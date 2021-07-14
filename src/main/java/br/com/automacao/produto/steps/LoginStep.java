package br.com.automacao.produto.steps;

import br.com.automacao.produto.pages.LoginPage;
import br.com.automacao.produto.pages.ConfiguracaoPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginStep {
	
	LoginPage loginPage = new LoginPage();

//	// Contexto

	@Dado("^Clicar no Botao entrar$")
	public void clicarNoBotaoEntrar() throws Throwable {
		loginPage.clickBotaoEntrar();
	}

	//Cenário

//	//login valido
@Quando("^preencher o usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
public void preencherOUsuarioESenha(String usuario, String senha) throws Throwable {
		loginPage.login();
		loginPage.fornecerCredenciais(usuario, senha);


	}


	@Então("^devo acessar portal$")
	public void devoAcessarPortal() throws Throwable {
		loginPage.clickBotaoAcessar();
		Thread.sleep(3000);
	}


	//	//login invalido
	@Quando("^preencher o usuario invalido$")
	public void preencherOUsuarioInvalidoESenha() throws Throwable {
		loginPage.fornecerCredenciaisinvalidas();
		loginPage.login();
		loginPage.clickBotaoAcessar();
	}

	@Então("^deve retornar mensagem \"([^\"]*)\"$")
	public void deveRetornarMensagem(String mensagem) throws Throwable {
		loginPage.validamsglogininvalido(mensagem);
	}


	//	//logout
	@Então("^devo clicar no botão sair$")
	public void devoClicarNoBotãoSair() throws Throwable {
		loginPage.clickBotaoSair();
	}

	@Então("^devo visualizar a pagina inicial do \"([^\"]*)\"$")
	public void devoVisualizarAPaginaInicialDo(String mensageminicio) throws Throwable {
		loginPage.validamsgtelainicial(mensageminicio);
	}




	@Before
	public void abreNavegador(){
		ConfiguracaoPage.abreNavegador();
	}

	@After
	public void fechaNavegador(){

		ConfiguracaoPage.getDriver().quit();
	}


}