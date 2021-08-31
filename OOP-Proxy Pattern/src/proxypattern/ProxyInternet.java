package proxypattern;

public class ProxyInternet implements Internet{
	private Internet internet=new RealInternet();
	@Override
	public void connect(String server) {
		// TODO Auto-generated method stub
		if(server=="facebook.com" || server=="youtube.com") {
			System.out.println("Access Denied");
		}
		else {
			internet.connect(server);
		}
	}

}
