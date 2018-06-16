package EX2_BuilderComposite;

import java.awt.Color;
import java.awt.Point;

//leaf
public class Cercle extends Forme{
	
	//��̬�ڲ���
	public static class Builder{
		//Required parameters
		private final Point coordonnees;
		
		//Optional parameters
		private Color remplissageColor=Color.black;
		private Color contourColor=Color.blue;
		
		//Builder�Ĺ��캯����ָ������Ĳ���
		public Builder (Point coordonnees){
			this.coordonnees=coordonnees;
		}
		
		public Builder remplissageColor(Color color){
			this.remplissageColor=color;
			return this;
		}
		
		public Builder contourColor(Color color){
			this.contourColor=color;
			return this;
		}
		
		public Cercle build(){
			return new Cercle(this);
		}
		
	}
	
	private Cercle(Builder builder){
		super(builder.coordonnees, builder.remplissageColor, builder.contourColor);
	}
	
	
	@Override
	public String toString(){
		return name+"\nCoordonnees: "+coordonnees+"\nRemplissageColor: "+remplissageColor+"\nContourColor: "+contourColor+"\n";
	}
	
	@Override
	public void print(){
		System.out.println(this.toString());
	}

}
