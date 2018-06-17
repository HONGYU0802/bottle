package AbstractFactory;

public class AbstractFactoryDriver {
	public static void main(String[] args){
		AbstractFactory shapefactory=FactoryProducer.getFactory("shape");
		Shape shape1= shapefactory.getShape("circle");
		shape1.draw();
		AbstractFactory shapefactory2=FactoryProducer.getFactory("color");
		Color color1= shapefactory2.getColor("red");
		color1.fill();
	}
}
