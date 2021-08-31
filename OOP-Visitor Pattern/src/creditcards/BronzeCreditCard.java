package creditcards;

import offers.OfferVisitor;

public class BronzeCreditCard implements CreditCard{

	@Override
	public String getname() {
		// TODO Auto-generate method stub
		return "Bronze";
	}
	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
