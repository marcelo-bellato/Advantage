package br.sp.bellato.page;
import br.sp.bellato.core.BasePage;

public class CadastroPage extends BasePage{	
	
	public void setUser() {
		dsl.clicarBotao("menuUserLink");
	}
	
	public void setNewAccount() {
		dsl.clicarLink("CREATE NEW ACCOUNT");
	}
	
	
	public void setUserName(String userName) {
		dsl.escrever("usernameRegisterPage", userName);
	}
	
	public void setEmail(String email) {
		dsl.escrever("emailRegisterPage", email);
	}
	
	public void setSenha(String senha) {
		dsl.escrever("passwordRegisterPage", senha);
	}
	
	public void setConfirmSenha(String senha) {
		dsl.escrever("confirm_passwordRegisterPage", senha);
	}
	
	public void setNome(String nome) {
		dsl.escrever("first_nameRegisterPage", nome);
	}
	
	public void setSobrenome(String sobrenome) {
		dsl.escrever("last_nameRegisterPage", sobrenome);
	}
	
	public void setTelefone(String fone) {
		dsl.escrever("phone_numberRegisterPage", fone);
	}
	
	public void setPais(String pais) {
		dsl.selecionarCombo("countryListboxRegisterPage", pais);
	}
	
	public void setCidade(String cidade) {
		dsl.escrever("cityRegisterPage", cidade);
	}
	
	public void setEndereco(String endereco) {
		dsl.escrever("addressRegisterPage", endereco);
	}
	
	public void setEstado(String estado) {
		dsl.escrever("state_/_province_/_regionRegisterPage", estado);
	}
	
	public void setCep(String cep) {
		dsl.escrever("postal_codeRegisterPage", cep);
	}
	
	public void setIagree() {
		dsl.clicarCheck("i_agree");
	}
	
	public void setRegister() {
		dsl.clicarBotao("register_btnundefined");
	}
	
	public String obterEmailCadastro(){
		return dsl.obterValorCampo("//label[contains(text(),\"Your email address isn't formatted correctly\")]");
	}
	
	public String obterlogin(){
		return dsl.obterLogCampo("menuUserLink");
	}
	
	
	
	

}
