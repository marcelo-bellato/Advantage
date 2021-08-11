package br.sp.bellato.core;

import static br.sp.bellato.core.DriverFactory.getDriver;
import static br.sp.bellato.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.sp.bellato.page.InicialPage;

public class BaseTest {
	private InicialPage inicialPage = new InicialPage();


	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void inicializa() {		
		inicialPage.acessarTelaInicial();
	}		
	
	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +  
				File.separator + testName.getMethodName() + ".jpg"));		
		killDriver();
			}

}
