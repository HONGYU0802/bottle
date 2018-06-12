package BuilderComposite;

import java.awt.Color;
import java.awt.Point;

public class FormeGeometriqueDriver {

	public static void main(String[] args) {
		FormeGeometrique cercle1=new FormeGeometrique.Builder( new Point(50, 50), Forme.cercle).remplissageColor(Color.green).contourColor(Color.red).build();
		System.out.println(cercle1.toString());
		FormeGeometrique cercle2=new FormeGeometrique.Builder( new Point(100, 100), Forme.rectangle).build();
		System.out.println(cercle2.toString());		
	}
	
}
