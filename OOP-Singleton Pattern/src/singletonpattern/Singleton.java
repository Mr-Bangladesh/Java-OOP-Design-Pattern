package singletonpattern;

public class Singleton {
	public static Singleton obj=new Singleton();
	private Singleton() {}
	public static Singleton getinstance() {
		return obj;
	}
	public void show() {
		System.out.println("This is singleton pattern");
	}
	public void show(int n) {
		System.out.println(n);
	}
}
