package statepattern;

public class Silent implements State{

	@Override
	public void alert(Context c) {
		// TODO Auto-generated method stub
		System.out.println("Silent mode");
	}

}
