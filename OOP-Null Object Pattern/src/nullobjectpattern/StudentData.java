package nullobjectpattern;

public class StudentData {
	public static String[] students= {"Faizul","Sohag","Pranta","Sourav"};
	
	public static Student getstudent(String name) {
		for(String student:students) {
			if(student==name) {
				return new StudentRealObject(name);
			}
		}
		return new StudentNullObject();
	}
}
