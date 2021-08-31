package statepattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c=new Context();
		c.alert();
		c.setstate(new Vibrate());
		c.alert();
		c.setstate(new Silent());
		c.alert();
	}

}
