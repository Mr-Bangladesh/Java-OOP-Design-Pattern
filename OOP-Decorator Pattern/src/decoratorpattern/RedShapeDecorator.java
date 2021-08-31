package decoratorpattern;

public class RedShapeDecorator extends Decorator{

	public RedShapeDecorator(Shape decoratedshape) {
		super(decoratedshape);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedshape.draw();
		setborder();
	}
	private void setborder() {
		System.out.println("Border color: Red");
	}

}
