package compositepattern;
import java.util.ArrayList;
import java.util.List;

public class Folder implements MainFolder{
	private List<MainFolder> childlist=new ArrayList<MainFolder>();
	private String fname;
	int count=0;
	 public Folder(String fname){
		 this.fname=fname;
	 }
	 public void addFile(MainFolder c1){
		 childlist.add(c1);
	 }
	 public void removeFile(MainFolder c1){
		 childlist.remove(c1);
	 }

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("In "+fname+" Folder: ");
		for (MainFolder m:childlist){
			m.showDetails();
		}


	}
}
