package AbstractFactory;

public class ColorFactory implements AbstractFactory{
	@Override
	public Color getColor(String color){
		if(color==null){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		}
		if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}
	
	@Override
	public Shape getShape(String shape){
		return null;
	}
}
