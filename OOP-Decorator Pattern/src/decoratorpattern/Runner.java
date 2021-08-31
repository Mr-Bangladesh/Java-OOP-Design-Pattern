package decoratorpattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle=new Circle();
		Shape redcircle=new RedShapeDecorator(new Circle());
		
		System.out.println("Normal Cirlce");
		circle.draw();
		System.out.println("Circle with Red Border");
		redcircle.draw();
	}

}
