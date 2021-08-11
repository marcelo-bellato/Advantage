package br.sp.bellato.page;
import br.sp.bellato.core.BasePage;


public class LoginPage extends BasePage{
	
	public void setNewAccount() {
		clicarLink("CREATE NEW ACCOUNT");
	}
	
	public void setUserName(String userName) {
		escrever("username", userName);
	}
	
	public void setSenha(String senha) {
		escrever("password", senha);
	}
	
	public void setSignIn() {
		clicarBotao("sign_in_btnundefined");
		
	}

}
