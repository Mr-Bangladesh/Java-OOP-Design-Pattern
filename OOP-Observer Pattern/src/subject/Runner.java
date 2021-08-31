package subject;

import observer.CurrentScore;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentScore currentscore=new CurrentScore();
		
		Cricket cricket=new Cricket();
		cricket.registerObserver(currentscore);
		
		cricket.datachanged();
	}

}
