package EX2_BuilderComposite;

import static org.junit.Assert.assertEquals;

import java.awt.Color;
import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CercleTest {
	
	Cercle cercle2 = new Cercle.Builder(new Point(20,20)).remplissageColor(Color.RED).build();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testToString() {
		cercle2.setName("cercle2");
		assertEquals("cercle2java.awt.Point[x=20,y=20]java.awt.Color[r=255,g=0,b=0]java.awt.Color[r=0,g=0,b=255]", cercle2.toString());
	}

	@Test
	public final void testPrint() {
		//void 类型如何检测？
	}

}
