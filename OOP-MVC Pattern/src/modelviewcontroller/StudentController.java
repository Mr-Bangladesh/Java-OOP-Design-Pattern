package modelviewcontroller;

public class StudentController {
	private StudentModel model;
	private StudentView view;
	
	public StudentController(StudentModel model,StudentView view) {
		this.model=model;
		this.view=view;
	}
	public void setstuname(String name) {
		model.setName(name);
	}
	public void setsturoll(String roll) {
		model.setRoll(roll);
	}
	public void setstuage(int age) {
		model.setAge(age);
	}
	
	public String getstuname() {
		return model.getName();
	}
	public String getsturoll() {
		return model.getRoll();
	}
	public int getstuage() {
		return model.getAge();
	}
	
	public void showupdateview() {
		view.showdetails(model.getName(), model.getRoll(), model.getAge());
	}
}
