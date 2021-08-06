package br.sp.bellato.test;
import static br.sp.bellato.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.sp.bellato.core.BaseTest;
import br.sp.bellato.page.CadastroPage;

public class Cadastro extends BaseTest{
	
private CadastroPage page;
	
	@Before
	public void inicializa() {		
		getDriver().get("http://advantageonlineshopping.com/#/");		
		page = new CadastroPage();
		
	}
	
		
	@Test
	public void cadastroUsuario() throws InterruptedException {	
		page.setUser();
		Thread.sleep(2000);
		page.setNewAccount();
		page.setUserName("Marcelo229");		
		page.setEmail("marcelo@google.com");
		page.setSenha("Os@sco10");
		page.setConfirmSenha("Os@sco10");
		page.setNome("Marcelo");
		page.setSobrenome("silva");
		page.setTelefone("55999998855");
		page.setPais("Brazil");
		page.setCidade("Osasco");
		page.setEndereco("Avenida Santo Antonio");
		page.setEstado("Sao Paulo");
		page.setCep("06080-000");
		page.setIagree();
		page.setRegister();
		Thread.sleep(1000);
		Assert.assertEquals("Marcelo229", page.obterlogin());
		
						
		}

}



