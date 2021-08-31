package strategypattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		a=10; b=5.6;
		
		Context context=new Context(new Addition());
		System.out.println(a+" + "+b+" = "+context.executestrategy(a, b));
		
		context=new Context(new Subtraction());
		System.out.println(a+" - "+b+" = "+context.executestrategy(a, b));
		
		context=new Context(new Multiplication());
		System.out.println(a+" * "+b+" = "+context.executestrategy(a, b));
		
		context=new Context(new Divide());
		System.out.println(a+" / "+b+" = "+context.executestrategy(a, b));
	}

}
