package offers;

import creditcards.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard bronze=new BronzeCreditCard();
		CreditCard silver=new SilverCreditCard();
		CreditCard gold=new GoldCreditCard();
		
		OfferVisitor visitor1=new FoodOfferVisitor();
		OfferVisitor visitor2=new GasOfferVisitor();
		
		//gold.accept(visitor1);
		//silver.accept(visitor1);
		
		//silver.accept(visitor2);
		gold.accept(visitor2);
	}
}
