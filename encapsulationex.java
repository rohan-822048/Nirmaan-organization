package Day14;

public class encapsulationex {
	
public static void main(String[] args) {
		
		
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		std1.setName("Rohan");
		String name =std1.getName();
		System.out.println(name);
		
		std1.setId(1);
		int id=std1.getId();
		System.out.println(id);
		
		std1.setRollNo(id);
		int rollNo= std1.getRollNo();
		System.out.println(rollNo);
		
		System.out.println();
		
		std2.setName("Mehala");
		String name1 =std2.getName();
		System.out.println(name1);
		
		std2.setId(2);
		int id1=std2.getId();
		System.out.println(id1);
		
		std2.setRollNo(id);
		int rollNo1=std2.getRollNo();
		System.out.println(rollNo1);
		
		System.out.println();
		
		std3.setName("kishore");
		String name2 =std3.getName();
		System.out.println(name2);
		
		std3.setId(3);
		int id2=std3.getId();
		System.out.println(id);
		
		std3.setRollNo(id2);
		int rollNo2=std3.getRollNo();
		System.out.println(rollNo2);
		
		System.out.println();
		
	}

		
}
