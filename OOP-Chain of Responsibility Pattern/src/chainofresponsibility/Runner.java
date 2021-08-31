package chainofresponsibility;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain viewer=new Viewer();
		Chain editor=new Editor();
		Chain admin=new Admin();
		
		viewer.setnext(editor);
		editor.setnext(admin);
		//read,edit,update,delete
		Service request=new Service("read");
		viewer.servicesupport(request);
	}

}
