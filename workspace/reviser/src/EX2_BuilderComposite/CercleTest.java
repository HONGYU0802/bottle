package EX2_BuilderComposite;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CercleTest {
	
	Cercle cercle1=new Cercle.Builder( new Point(50, 50)).remplissageColor(Color.green).contourColor(Color.red).build();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testToString() {
		
	}

}
