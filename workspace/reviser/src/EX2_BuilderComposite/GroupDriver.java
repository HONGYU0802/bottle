package EX2_BuilderComposite;

import java.awt.Color;
import java.awt.Point;

public class GroupDriver {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle.Builder(new Point(10,10)).build();
		Cercle cercle2 = new Cercle.Builder(new Point(20,20)).remplissageColor(Color.RED).build();
		Cercle cercle3 = new Cercle.Builder(new Point(30,30)).contourColor(Color.CYAN).build();
	
		Groupe forme1 = new Groupe();
		Groupe forme2 = new Groupe();
		Groupe forme3 = new Groupe();
		
		forme1.add(cercle1);
		forme1.add(cercle2);
		
		forme2.add(cercle3);
		
		forme3.add(forme1);
		forme3.add(forme2);
		
		//affiche la hierarchie
		forme3.print();
		
	}

}
