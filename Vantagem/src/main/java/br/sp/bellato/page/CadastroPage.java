package br.sp.bellato.page;
import br.sp.bellato.core.BasePage;

public class CadastroPage extends BasePage{		
	
	
	public void setUserName(String userName) {
		escrever("usernameRegisterPage", userName);
	}
	
	public void setEmail(String email) {
		escrever("emailRegisterPage", email);
	}
	
	public void setSenha(String senha) {
		escrever("passwordRegisterPage", senha);
	}
	
	public void setConfirmSenha(String senha) {
		escrever("confirm_passwordRegisterPage", senha);
	}
	
	public void setNome(String nome) {
		escrever("first_nameRegisterPage", nome);
	}
	
	public void setSobrenome(String sobrenome) {
		escrever("last_nameRegisterPage", sobrenome);
	}
	
	public void setTelefone(String fone) {
		escrever("phone_numberRegisterPage", fone);
	}
	
	public void setPais(String pais) {
		selecionarCombo("countryListboxRegisterPage", pais);
	}
	
	public void setCidade(String cidade) {
		escrever("cityRegisterPage", cidade);
	}
	
	public void setEndereco(String endereco) {
		escrever("addressRegisterPage", endereco);
	}
	
	public void setEstado(String estado) {
		escrever("state_/_province_/_regionRegisterPage", estado);
	}
	
	public void setCep(String cep) {
		escrever("postal_codeRegisterPage", cep);
	}
	
	public void setIagree() {
		clicarCheck("i_agree");
	}
	
	public void setRegister() {
		clicarBotao("register_btnundefined");
	}
	
	public void setClicarSenha() {
		clicarCheck("passwordRegisterPage");
	}
	
	public String obterEmailCadastro(){
		return obterValorCampo("//label[contains(text(),\"Your email address isn't formatted correctly\")]");
	}
	
	
	
	
	
	

}
