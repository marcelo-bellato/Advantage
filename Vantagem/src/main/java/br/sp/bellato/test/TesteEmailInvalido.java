package br.sp.bellato.test;

import static br.sp.bellato.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import br.sp.bellato.page.CadastroPage;

public class TesteEmailInvalido {
	
	private CadastroPage page;
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void inicializa() {		
		getDriver().get("http://advantageonlineshopping.com/#/");		
		page = new CadastroPage();
		
	}
	
	
	@Test
	public void emailInvalido() throws InterruptedException {
		page.setUser();	
		Thread.sleep(1800);
		page.setNewAccount();
		page.setUserName("Marcelo229");
		page.setEmail("marcelogoogle.com");
		Thread.sleep(1000);
		Assert.assertEquals("Your email address isn't formatted correctly", page.obterEmailCadastro());
		page.setSenha("Os@sco10");
	}

}
