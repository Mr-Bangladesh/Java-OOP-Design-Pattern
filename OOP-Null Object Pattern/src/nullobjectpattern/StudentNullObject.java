package nullobjectpattern;

public class StudentNullObject extends Student{

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return "Data Unavailable";
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

}
