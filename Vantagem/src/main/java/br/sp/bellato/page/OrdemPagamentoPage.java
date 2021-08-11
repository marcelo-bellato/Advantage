package br.sp.bellato.page;
import br.sp.bellato.core.BasePage;

public class OrdemPagamentoPage extends BasePage{
	
	public void setNext() {
		clicarBotao("next_btn");		
	}
	
	public void setMastercreditic() {
		clicarCheck("masterCredit");
	}
	
	public void setCardnumber(String cardNumber) {
		escrever("card_number", cardNumber);
	}
	
	public void setCVV(String string) {
		escrever("card_number", string);
	}
	
	public void setMonth(String month) {
		selecionarCombo("mmListbox", month);
	}
	
	public void setYear(String year) {
		selecionarCombo("yyyyListbox", year);
	}
	
	public void setNomeTitular(String nomeTitular) {
		escrever("cardholder_name", nomeTitular);
	}
	
	public void setPay() {
		clicarBotao("pay_now_btn_ManualPayment");
	}

}
