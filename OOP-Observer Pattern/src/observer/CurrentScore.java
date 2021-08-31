package observer;

public class CurrentScore implements Observer{
	private int runs,wickets;
	private double overs;
	@Override
	public void update(int runs, int wickets, double overs) {
		// TODO Auto-generated method stub
		this.runs=runs;
		this.wickets=wickets;
		this.overs=overs;
		display();
	}
	public void display() {
		System.out.println("Current Run: "+runs+" wickets: "+wickets+" overs: "+overs);
	}
}
