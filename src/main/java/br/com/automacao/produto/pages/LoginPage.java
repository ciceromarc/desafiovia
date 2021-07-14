package br.com.automacao.produto.pages;

import br.com.automacao.produto.pages.ConfiguracaoPage;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginPage {

	public void login() throws Exception {

		ConfiguracaoPage.getDriver().manage().window().maximize();

//		getDriver().switchTo().frame(1);
//		getDriver().switchTo().frame(1);

//		getDriver().findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_bt_entar_normal\"]")).click();

	}



	public void acessarUrl(String url)  throws Exception {
		ConfiguracaoPage.getDriver().get(url);
		ConfiguracaoPage.driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}


    public void fornecerCredenciais(String usuario, String senha)  {
		ConfiguracaoPage.driver.findElement(By.id("Cpf")).sendKeys(usuario);
		ConfiguracaoPage.driver.findElement(By.id("Senha")).sendKeys(senha);
    }


	public void clickBotaoSair()  {
		ConfiguracaoPage.driver.findElement(By.cssSelector("form > button")).click();
	}


		public void clickBotaoEntrar() throws Exception {
       // Thread.sleep(3000);
			ConfiguracaoPage.driver.findElement(By.cssSelector("div.menu-extras.topbar-custom > ul > li > a > img")).click();

	}


	public void clickBotaoAcessar() {
		ConfiguracaoPage.driver.findElement(By.cssSelector("div.col-12.mb-3.m-t-10.small.text-right > button")).click();
	}

	public void validamsglogininvalido(String mensagem) {
		String msgconteudo = ConfiguracaoPage.driver.findElement(By.cssSelector("div.swal2-content")).getText();
		System.out.println("msgconteudo: "+msgconteudo);
		Assert.assertEquals(mensagem, msgconteudo);
		ConfiguracaoPage.driver.findElement(By.cssSelector("button.swal2-confirm.swal2-styled")).click();

	}

	public void fornecerCredenciaisinvalidas() {
		ConfiguracaoPage.driver.findElement(By.id("Cpf")).sendKeys("12345678911");
		ConfiguracaoPage.driver.findElement(By.id("Senha")).sendKeys("54321");
	}

	public void validamsgtelainicial(String mensageminicio) {
		String msgconteudoinicio = ConfiguracaoPage.driver.findElement(By.cssSelector("div.col-12.text-center.text-white > h2")).getText();
		System.out.println("msgconteudoinicio: "+msgconteudoinicio);
		Assert.assertEquals(mensageminicio, msgconteudoinicio);
	}
}
