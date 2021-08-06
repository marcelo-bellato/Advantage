package br.sp.bellato.core;
import static br.sp.bellato.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
		
	
	/********* TextField e TextArea ************/
	
	public void escrever(String name_campo, String texto) {
		getDriver().findElement(By.name(name_campo)).sendKeys(texto);
	}
	
	/********* Botao ************/
	
	public void clicarCheck(String name) {
		getDriver().findElement(By.name(name)).click();
	}	
	
	public void clicarBotao(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}
	
	/********* Combo ************/
	
	public void selecionarCombo(String name, String valor) {
		WebElement element = getDriver().findElement(By.name(name));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public String obterValorCampo(String name) {
		return getDriver().findElement(By.xpath(name)).getText();
	}
	
	public String obterLogCampo(String log) {
		return getDriver().findElement(By.id(log)).getText();
	}
	
	
	
	
	
	

}
