package creditcards;

import offers.OfferVisitor;

public class SilverCreditCard implements CreditCard{
	@Override
	public String getname() {
		// TODO Auto-generate method stub
		return "Silver";
	}
	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
