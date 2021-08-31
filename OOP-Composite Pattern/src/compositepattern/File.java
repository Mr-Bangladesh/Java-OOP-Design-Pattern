package compositepattern;

public class File implements MainFolder{
	private String name;
	private float size;
	private String type;
	public File(String name,float size,String type){
		this.name=name;
		this.size=size;
		this.type=type;
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("File Name:"+name);
		System.out.println("File Size:"+size);
		System.out.println("File Type:"+type);
	}
}
