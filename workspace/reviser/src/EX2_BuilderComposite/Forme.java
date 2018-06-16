package EX2_BuilderComposite;

import java.awt.Color;
import java.awt.Point;

//Component
public abstract class Forme {
	public Point coordonnees;
	public Color remplissageColor;
	public Color contourColor;
	public String name;

	public void setName(String name){
		this.name=name;
	}
	public Forme(){
		
	}
	
	public Forme(Point coordonnees,Color remplissageColor,Color contourColor){
		this.coordonnees=coordonnees;
		
		this.remplissageColor=remplissageColor;
		this.contourColor=contourColor;
	}
	
	public abstract void print();
}
