package br.sp.bellato.test;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.sp.bellato.core.BaseTest;
import br.sp.bellato.page.CadastroPage;
import br.sp.bellato.page.InicialPage;
import br.sp.bellato.page.LoginPage;
import br.sp.bellato.page.OrdemPagamentoPage;
import br.sp.bellato.page.TabletPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoTest extends BaseTest{
	
	InicialPage inicialPage = new InicialPage();	
	CadastroPage cadastroPage = new CadastroPage();
	LoginPage loginPage = new LoginPage();
	TabletPage tabletPage = new TabletPage();
	OrdemPagamentoPage ordemPagamentoPage = new OrdemPagamentoPage();
	
	@Test
	public void test4_consultaTablet() throws InterruptedException{
		inicialPage.setUser();	
		Thread.sleep(1800);
		loginPage.setUserName("Marcelo229");
		loginPage.setSenha("Os@sco10");
		loginPage.setSignIn();
		Thread.sleep(1000);
		inicialPage.setTablets();
		tabletPage.setHP1000G2();
		Assert.assertEquals("HP ELITEPAD 1000 G2 TABLET", tabletPage.obterTablet());
	}
	
	
	@Test
	public void test5_compraTablet() throws InterruptedException {
		inicialPage.setUser();	
		Thread.sleep(1800);
		loginPage.setUserName("Marcelo229");
		loginPage.setSenha("Os@sco10");
		loginPage.setSignIn();
		Thread.sleep(1000);
		inicialPage.setTablets();
		tabletPage.setHP1000G2();
		tabletPage.setAddToCart();
		tabletPage.setCheckout();
		ordemPagamentoPage.setNext();
		Thread.sleep(1000);
		ordemPagamentoPage.setMastercreditic();
		ordemPagamentoPage.setCardnumber("488622335566");
		ordemPagamentoPage.setCVV("101");
		ordemPagamentoPage.setMonth("10");
		ordemPagamentoPage.setYear("2024");
		ordemPagamentoPage.setNomeTitular("Marcelo Silva");
		ordemPagamentoPage.setPay();
	}

}
