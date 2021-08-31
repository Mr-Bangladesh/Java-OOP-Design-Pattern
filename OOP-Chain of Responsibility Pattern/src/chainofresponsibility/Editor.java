package chainofresponsibility;

public class Editor implements Chain{
	private Chain nextchain;
	@Override
	public void setnext(Chain nextchain) {
		// TODO Auto-generated method stub
		this.nextchain=nextchain;
	}
	String operation;
	@Override
	public void servicesupport(Service request) {
		// TODO Auto-generated method stub
		this.operation=request.operation;
		if(operation=="read" || operation=="edit") {
			System.out.println("Editor can "+operation+" this Article");
		}
		else {
			System.out.println("Editor can not "+operation+" this Article");
			nextchain.servicesupport(request);
		}
	}

}
