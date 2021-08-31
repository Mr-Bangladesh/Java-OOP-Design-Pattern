package templatepattern;

public abstract class Game {
	abstract void initialize();
	abstract void startplay();
	abstract void endplay();
	public final void playgame() {
		initialize();
		startplay();
		endplay();
	}
}
