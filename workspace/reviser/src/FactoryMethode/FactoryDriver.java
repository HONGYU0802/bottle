package FactoryMethode;

public class FactoryDriver {

	public static void main(String[] args) {
		ShapeFactory shape=new ShapeFactory();
		Shape circle1=shape.getShape("circle");
		circle1.draw();
		Shape rectangle1=shape.getShape("rectangle");
		rectangle1.draw();
	}

}
