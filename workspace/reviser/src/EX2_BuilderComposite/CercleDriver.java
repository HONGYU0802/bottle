package EX2_BuilderComposite;

import java.awt.Color;
import java.awt.Point;

public class CercleDriver {

	public static void main(String[] args) {
		Cercle cercle1=new Cercle.Builder( new Point(50, 50)).remplissageColor(Color.green).contourColor(Color.red).build();
		System.out.println(cercle1.toString());
		Cercle cercle2=new Cercle.Builder( new Point(100, 100)).build();
		System.out.println(cercle2.toString());	
		//cercle2.print();	
	}
	
}
