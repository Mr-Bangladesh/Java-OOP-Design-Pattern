package modelviewcontroller;

public class StudentModel {
	private String Name,Roll;
	private int Age;
	public void setName(String name) {
		Name=name;
	}
	public void setRoll(String roll) {
		Roll=roll;
	}
	public void setAge(int age) {
		Age=age;
	}
	public String getName() {
		return Name;
	}
	public String getRoll() {
		return Roll;
	}
	public int getAge() {
		return Age;
	}
}
