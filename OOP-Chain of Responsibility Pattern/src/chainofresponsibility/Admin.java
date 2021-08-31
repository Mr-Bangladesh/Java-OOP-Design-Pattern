package chainofresponsibility;

public class Admin implements Chain{
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
		if(operation=="read" || operation=="edit" || operation=="update" || operation=="delete") {
			System.out.println("Admin can "+operation+" this Article");
		}
		else {
			System.out.println("Admin can not "+operation+" this Article");
			System.out.println("None can solve. This "+operation+" should be neglected");
		}
	}

}
