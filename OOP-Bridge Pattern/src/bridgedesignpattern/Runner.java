package bridgedesignpattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car=new Car(new Produce(),new Assemble());
		car.manufacture();
		
		Vehicle bus=new Bus(new Produce(),new Assemble());
		bus.manufacture();
		
		Vehicle truck=new Truck(new Produce(),new Assemble());
		truck.manufacture();
	}

}
