package EX1_Classes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MontantTest {
	
	Montant m;
	Montant m1;
	
	
	@Before
	public void setUp() throws Exception {
		m= new Montant(100);
		m1= new Montant(100,Monnaie.dollar);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testMontant(){
		assertEquals(100,m.doubleValue(),0.01);
		assertEquals(Monnaie.euro,m.monnaie());
	}

	@Test
	public final void testtoString() {
		assertEquals("100.0euro", m.toString());
	}

	@Test
	public final void testConversionMontant() {
		assertEquals(116,m.ConversionMontant(),0.01);
	}
	
	@Test
	public final void testequals() {	
		assertEquals(false, m.equals(m1));
	}

	@Test
	public final void testcompareTo() {
		assertEquals(1,m.compareTo(m1));
	}

}
