package strategypattern;

public class Context {
	private Strategy strategy;
	public Context(Strategy s) {
		this.strategy=s;
	}
	public double executestrategy(double a,double b) {
		return strategy.arithmatic(a, b);
	}
}
