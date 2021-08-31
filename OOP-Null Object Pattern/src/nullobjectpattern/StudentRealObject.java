package nullobjectpattern;

public class StudentRealObject extends Student{
	public StudentRealObject(String name) {
		this.name=name;
	}
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

}
