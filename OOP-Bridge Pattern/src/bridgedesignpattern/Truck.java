package bridgedesignpattern;

public class Truck extends Vehicle{

	protected Truck(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("Truck Manufacturing");
		workshop1.work();
		workshop2.work();
	}

}
