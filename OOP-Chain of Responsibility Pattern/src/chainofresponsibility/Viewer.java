package chainofresponsibility;

public class Viewer implements Chain{
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
		this.operation=request.getoperation();
		if(operation=="read") {
			System.out.println("Viewer can "+operation+" this Article");
		}
		else {
			System.out.println("Viewer can not "+operation+" this Article");
			nextchain.servicesupport(request);
		}
	}

}
