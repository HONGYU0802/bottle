package EX2_BuilderComposite;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GroupeTest {
	Cercle cercle1;
	Groupe forme1;
	
	@Before
	public void setUp() throws Exception {
		cercle1 = new Cercle.Builder(new Point(10,10)).build();
		forme1 = new Groupe();
		cercle1.setName("cercle1");
		forme1.setName("forme1");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testToString() {
		assertEquals("forme1", forme1.toString());
	}

	@Test
	public final void testPrint() {
	
	}

	@Test
	public final void testAdd() {
		forme1.add(cercle1);
		assertEquals("cercle1java.awt.Point[x=10,y=10]java.awt.Color[r=0,g=0,b=0]java.awt.Color[r=0,g=0,b=255]", cercle1.toString());
	}

	@Test
	public final void testRemove() {
		Cercle cercle2 = new Cercle.Builder(new Point(20,20)).build();
		cercle2.setName("cercle2");
		forme1.add(cercle1);
		forme1.add(cercle2);
		forme1.remove(cercle1);
		assertEquals("cercle1java.awt.Point[x=10,y=10]java.awt.Color[r=0,g=0,b=0]java.awt.Color[r=0,g=0,b=255]", cercle1.toString());
	}

}
