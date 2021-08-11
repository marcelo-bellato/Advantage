package br.sp.bellato.page;
import static br.sp.bellato.core.DriverFactory.getDriver;

import br.sp.bellato.core.BasePage;


public class InicialPage extends BasePage{
	
	public void setUser() {
		clicarBotao("menuUserLink");
	}
	
	public void setTablets() {
		clicarBotao("tabletsImg");
	}
	
	public void acessarTelaInicial() {
		getDriver().get("http://advantageonlineshopping.com/#/");
	}
	
	public void setMyAccount() {
		clicarLabel("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[3]/a[1]/div[1]/label[1]");
	}
	
	public String obterLogin() {
		return obterValorCampo2("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]");
	}

}
