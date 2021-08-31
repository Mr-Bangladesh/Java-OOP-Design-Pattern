package offers;

import creditcards.*;

public class FoodOfferVisitor implements OfferVisitor{

	@Override
	public void visit(BronzeCreditCard bronze) {
		// TODO Auto-generated method stub
		System.out.println("Bronze Credit Card will get 5% discount on Food");
	}

	@Override
	public void visit(SilverCreditCard silver) {
		// TODO Auto-generated method stub
		System.out.println("Silver Credit Card will get 8% discount on Food");
	}

	@Override
	public void visit(GoldCreditCard gold) {
		// TODO Auto-generated method stub
		System.out.println("Gold Credit Card will get 12% discount on Food");
	}
	

}
