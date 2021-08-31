package bridgedesignpattern;

public abstract class Vehicle {
	protected Workshop workshop1,workshop2;
	protected Vehicle(Workshop workshop1,Workshop workshop2) {
		this.workshop1=workshop1;
		this.workshop2=workshop2;
	}
	abstract public void manufacture();
}
