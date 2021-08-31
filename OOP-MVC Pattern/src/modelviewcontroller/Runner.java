package modelviewcontroller;

public class Runner {
	public static void main(String[] args) {
		StudentModel model=ReadStudentData();
		StudentView view=new StudentView();
		StudentController controller=new StudentController(model,view);
		
		controller.showupdateview();
		
		controller.setstuage(22);
		controller.showupdateview();
	}
	private static StudentModel ReadStudentData() {
		StudentModel student=new StudentModel();
		
		student.setName("Faizul Haque");
		student.setRoll("17CSE020");
		student.setAge(23);
		
		return student;
	}
}
