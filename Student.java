package Day14;

public class Student {
	
	
	private int id;
	private String name;
	private int rollNo;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setRollNo(int RollNo) {
		rollNo = RollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	Student(int id,String name,int rollNo){
		
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	
	
	
}
