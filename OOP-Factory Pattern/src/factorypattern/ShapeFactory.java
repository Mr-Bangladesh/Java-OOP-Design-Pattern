package factorypattern;

public class ShapeFactory {
	public Shape getshape(String type) {
		if(type.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(type.equalsIgnoreCase("square")) {
			return new Square();
		}
		else if(type.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		else if(type.equalsIgnoreCase("triangle")) {
			return new Triangle();
		}
		else {
			return null;
		}
	}
}
