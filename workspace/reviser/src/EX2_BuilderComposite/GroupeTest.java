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
		//assertEquals("sss", forme1.print());×Ö·û´®Êý×Ö¶Ô±È
	}

	@Test
	public final void testAdd() {
		
	}

	@Test
	public final void testRemove() {
		
	}

}
