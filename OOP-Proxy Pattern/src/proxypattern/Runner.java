package proxypattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Internet internet=new ProxyInternet();
		internet.connect("facebook.com");
		internet.connect("google.com");
	}

}
