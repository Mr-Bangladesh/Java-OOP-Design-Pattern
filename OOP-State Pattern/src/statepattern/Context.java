package statepattern;

public class Context {
	private State curstate;
	public Context() {
		curstate=new General();
	}
	public void setstate(State s) {
		curstate=s;
	}
	public void alert() {
		curstate.alert(this);
	}
}
