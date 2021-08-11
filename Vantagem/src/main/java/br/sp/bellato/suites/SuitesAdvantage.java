package br.sp.bellato.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.sp.bellato.test.ContaTest;
import br.sp.bellato.test.MovimentacaoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class
})
public class SuitesAdvantage {
	
	
}
