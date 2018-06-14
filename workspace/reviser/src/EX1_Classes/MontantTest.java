package EX1_Classes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MontantTest {
	
	Montant m= new Montant();
	Montant m1= new Montant();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testInitial() {
		m.Initial();
		assertEquals(0,m.doubleValue(),0.01);
		assertEquals(Monnaie.euro,m.monnaie());
	}

	@Test
	public final void testConversionCaractere() {
		m.Initial();
		m.ConversionCaractere();
		assertEquals(Monnaie.dollar, m.monnaie());
	}

	@Test
	public final void testConversionMontant() {
		m.Initial();
		m.setsomme(100);
		m.ConversionMontant();
		assertEquals(87, m.doubleValue(),0.01);
	}
	
	@Test
	public final void testEgale() {
		m.Initial();
		m.setsomme(100);
		m1.Initial();
		m1.setsomme(1000);		
		assertEquals(false, m.egale(m1));
	}

	@Test
	public final void testComparaison() {
		m.Initial();
		m1.setmonnaie(Monnaie.dollar);
		m.setsomme(100);
		m1.setsomme(100);
		int expectedReturn;
		int actualReturn;
		expectedReturn = 3;
		m.Comparaison(m1);
		actualReturn=Montant.flag;
		assertEquals(expectedReturn,actualReturn);
	}

}
