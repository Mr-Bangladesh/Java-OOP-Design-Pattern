package bridgedesignpattern;

public class Car extends Vehicle{

	protected Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("Car manufacturing");
		workshop1.work();
		workshop2.work();
	}

}
