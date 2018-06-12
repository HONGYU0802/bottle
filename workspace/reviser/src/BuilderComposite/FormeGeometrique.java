package BuilderComposite;

import java.awt.Color;
import java.awt.Point;

public class FormeGeometrique {
	private final Point coordonnees;
	private final Forme forme;
	
	private final Color remplissageColor;
	private final Color contourColor;
	
	//��̬�ڲ���
	public static class Builder{
		//Required parameters
		private final Point coordonnees;
		private final Forme forme;
		
		//Optional parameters
		private Color remplissageColor=Color.black;
		private Color contourColor=Color.blue;
		
		//Builder�Ĺ��캯����ָ������Ĳ���
		public Builder (Point coordonnees, Forme forme){
			this.coordonnees=coordonnees;
			this.forme=forme;
		}
		
		public Builder remplissageColor(Color color){
			this.remplissageColor=color;
			return this;
		}
		
		public Builder contourColor(Color color){
			this.contourColor=color;
			return this;
		}
		
		public FormeGeometrique build(){
			return new FormeGeometrique(this);
		}
		
	}
	
	private FormeGeometrique(Builder builder){
		this.coordonnees=builder.coordonnees;
		this.forme=builder.forme;
		
		this.remplissageColor=builder.remplissageColor;
		this.contourColor=builder.contourColor;
	}
	
	@Override
	public String toString(){
		return "Forme: "+forme+"\nCoordonnees: "+coordonnees+"\nRemplissageColor: "+remplissageColor+"\nContourColor: "+contourColor;
	}
	

}
