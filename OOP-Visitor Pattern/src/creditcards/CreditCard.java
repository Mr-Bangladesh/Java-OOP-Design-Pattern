package creditcards;

import offers.OfferVisitor;

public interface CreditCard {
	String getname();
	void accept(OfferVisitor v);
}
