package compositepattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File d1 =new File("notes",2,"txt file");
		File d2 =new File("bfs",3,"c file");
		File d3 =new File("dfs",4,"c++ file");
		File d4 =new File("knapsack",6,"java file");
		File d5 =new File("tower of hanoi",3,"python file");
			
		Folder folder1=new Folder("DSA");
		Folder folder2=new Folder("graph");
		Folder folder3=new Folder("dp");
		Folder folder4=new Folder("math");
		
		folder1.addFile(folder2);
		folder1.addFile(folder3);
		folder1.addFile(d1);
		
		folder2.addFile(d2);
		folder2.addFile(d3);	

		folder3.addFile(d4);
		
		folder4.addFile(d5);
		
		folder1.showDetails();
	}

}
