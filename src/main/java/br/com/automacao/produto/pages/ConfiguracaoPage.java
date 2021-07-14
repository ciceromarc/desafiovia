package br.com.automacao.produto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfiguracaoPage {

	public static WebDriver driver;

	public static void abreNavegador() {

		String caminhoDriver = "lib/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", caminhoDriver);
		driver = new ChromeDriver();

	}

	public static WebDriver getDriver() {

		return driver;
	}

}
