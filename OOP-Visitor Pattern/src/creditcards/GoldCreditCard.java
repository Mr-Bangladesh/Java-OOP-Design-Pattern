package creditcards;

import offers.OfferVisitor;

public class GoldCreditCard implements CreditCard{
	
	@Override
	public String getname() {
		// TODO Auto-generate method stub
		return "Gold";
	}
	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
