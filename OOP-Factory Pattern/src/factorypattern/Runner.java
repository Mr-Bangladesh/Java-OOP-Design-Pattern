package factorypattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory=new ShapeFactory();
		
		Shape circle=factory.getshape("circle");
		circle.draw();
		
		Shape square=factory.getshape("Square");
		square.draw();
	}

}
