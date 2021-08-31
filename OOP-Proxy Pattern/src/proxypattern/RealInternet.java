package proxypattern;

public class RealInternet implements Internet{

	@Override
	public void connect(String server) {
		// TODO Auto-generated method stub
		System.out.println("Connecing to "+server);
	}

}
