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
		assertEquals("0.0euro", m.ConversionCaractere());
	}

	@Test
	public final void testConversionMontant() {
		m.Initial();
		m.setsomme(100);
		assertEquals(116,m.ConversionMontant(),0.01);
	}
	
	@Test
	public final void testEgale() {
		m.Initial();
		m.setsomme(100);
		m1.Initial();
		m1.setsomme(1000);		
		assertEquals("Ils ne sont pas egales", m.egale(m1));
	}

	@Test
	public final void testComparaison() {
		m.Initial();
		m1.Initial();
		
		m.setsomme(100);
		m1.setsomme(100);
		m1.setmonnaie(Monnaie.dollar);

		assertEquals("superieur",m.Comparaison(m1));
	}

}
