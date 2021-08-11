package br.sp.bellato.test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.sp.bellato.core.BaseTest;
import br.sp.bellato.page.CadastroPage;
import br.sp.bellato.page.InicialPage;
import br.sp.bellato.page.LoginPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest{

	InicialPage inicialPage = new InicialPage();	
	CadastroPage cadastroPage = new CadastroPage();
	LoginPage loginPage = new LoginPage();	
		
	@Test
	public void test1_emailInvalido() throws InterruptedException {
		inicialPage.setUser();	
		Thread.sleep(1800);
		loginPage.setNewAccount();
		cadastroPage.setUserName("Marcelo229");
		cadastroPage.setEmail("marcelogoogle.com");
		cadastroPage.setClicarSenha();
		Thread.sleep(1000);
		Assert.assertEquals("Your email address isn't formatted correctly", cadastroPage.obterEmailCadastro());
	}
	
	@Test
	public void test2_cadastroUsuario() throws InterruptedException {	
		inicialPage.setUser();
		Thread.sleep(2000);
		loginPage.setNewAccount();
		cadastroPage.setUserName("Marcelo229");		
		cadastroPage.setEmail("marcelo@google.com");
		cadastroPage.setSenha("Os@sco10");
		cadastroPage.setConfirmSenha("Os@sco10");
		cadastroPage.setNome("Marcelo");
		cadastroPage.setSobrenome("silva");
		cadastroPage.setTelefone("55999998855");
		cadastroPage.setPais("Brazil");
		cadastroPage.setCidade("Osasco");
		cadastroPage.setEndereco("Avenida Santo Antonio");
		cadastroPage.setEstado("Sao Paulo");
		cadastroPage.setCep("06080-000");
		cadastroPage.setIagree();
		cadastroPage.setRegister();
		Thread.sleep(1000);
		Assert.assertEquals("Marcelo229", inicialPage.obterLogin());
		}
	
	
	@Test
	public void test3_login() throws InterruptedException {		
			inicialPage.setUser();	
			Thread.sleep(1800);
			loginPage.setUserName("Marcelo229");
			loginPage.setSenha("Os@sco10");
			loginPage.setSignIn();
			Thread.sleep(1000);
			Assert.assertEquals("Marcelo229", inicialPage.obterLogin());
	}
	
	
	

}



