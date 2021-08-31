package subject;

import java.util.ArrayList;
import observer.Observer;

public class Cricket implements Subject{

	int runs,wickets; double overs;
	
	ArrayList<Observer> observerlist;
	
	public Cricket() {
		observerlist=new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observerlist.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		// TODO Auto-generated method stub
		observerlist.remove(observerlist.indexOf(o));
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer:observerlist) {
			observer.update(runs,wickets,overs);
		}
	}
	
	private int getlatestruns() {
		return 107;
	}
	private int getlatestwickets() {
		return 4;
	}
	private double getlatestovers() {
		return 4.5;
	}
	public void datachanged() {
		runs=getlatestruns();
		wickets=getlatestwickets();
		overs=getlatestovers();
		notifyObserver();
	}

}
