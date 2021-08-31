package chainofresponsibility;

public interface Chain {
	void setnext(Chain nextchain);
	void servicesupport(Service request);
}
