package br.sp.bellato.page;
import br.sp.bellato.core.BasePage;

public class TabletPage extends BasePage{
	
	public void setHP1000G2() {
		clicarBotao("16");
	}
	
	public void setAddToCart() {
		clicarCheck("save_to_cart");
	}
	
	public void setCheckout() {
		clicarBotao("checkOutPopUp");
	}

	public String obterTablet() {
		return obterValorCampo2("/html[1]/body[1]/div[3]/section[1]/article[1]/div[2]/div[2]/h1[1]");
	}

}
