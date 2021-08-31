package nullobjectpattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=StudentData.getstudent("Faizul");
		Student student2=StudentData.getstudent("abc");
		
		System.out.println("[ Null Status:"+student1.isNull()+", Name: "+student1.getname()+" ]");
		System.out.println("[ Null Status:"+student2.isNull()+", Name: "+student2.getname()+" ]");
	}

}
