package offers;

import creditcards.*;

public class GasOfferVisitor implements OfferVisitor{

	@Override
	public void visit(BronzeCreditCard bronze) {
		// TODO Auto-generated method stub
		System.out.println("Bronze Credit Card will get 2% discount on Gas");
	}

	@Override
	public void visit(SilverCreditCard silver) {
		// TODO Auto-generated method stub
		System.out.println("Silver Credit Card will get 4% discount on Gas");
	}

	@Override
	public void visit(GoldCreditCard gold) {
		// TODO Auto-generated method stub
		System.out.println(gold.getname()+" Credit Card will get 10% discount on Gas");
	}

}
