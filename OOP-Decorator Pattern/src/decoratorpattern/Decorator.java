package decoratorpattern;

public abstract class Decorator implements Shape{
	protected Shape decoratedshape;
	public Decorator(Shape decoratedshape) {
		this.decoratedshape=decoratedshape;
	}
	
	public void draw() {
		decoratedshape.draw();
	}
}
