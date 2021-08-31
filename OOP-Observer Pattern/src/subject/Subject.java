package subject;

import observer.Observer;

public interface Subject {
	void registerObserver(Observer o);
	void unregisterObserver(Observer o);
	void notifyObserver();
}
