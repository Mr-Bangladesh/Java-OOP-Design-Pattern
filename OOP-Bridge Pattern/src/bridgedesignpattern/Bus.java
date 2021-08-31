package bridgedesignpattern;

public class Bus extends Vehicle{

	protected Bus(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		System.out.println("Bus Manufacturing");
		workshop1.work();
		workshop2.work();
	}

}
