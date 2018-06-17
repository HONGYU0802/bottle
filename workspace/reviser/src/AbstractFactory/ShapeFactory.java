package AbstractFactory;

public class ShapeFactory implements AbstractFactory{
	@Override
	public Shape getShape(String shape){
		if(shape==null){
			return null;
		}
		if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
	
	@Override
	public Color getColor(String color){
		return null;
	}
}
