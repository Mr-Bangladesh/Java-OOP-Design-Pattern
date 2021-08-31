package singletonpattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj=Singleton.getinstance();
		obj.show();
		obj.show(4);
	}

}
