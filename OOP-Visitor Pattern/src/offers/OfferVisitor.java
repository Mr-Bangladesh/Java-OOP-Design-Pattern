package offers;

import creditcards.BronzeCreditCard;
import creditcards.GoldCreditCard;
import creditcards.SilverCreditCard;

public interface OfferVisitor {
	void visit(BronzeCreditCard bronze);
	void visit(SilverCreditCard silver);
	void visit(GoldCreditCard gold);
}
