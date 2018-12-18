
public class Student {

	 public int ID;
     public String Name;
	
	
	private Student() {
		
	}
	
	private static Student [] a = new Student [9];
	public static Student creObj() {
		for (int i=0; i<a.length; i++) {
		if(a[i] == null ) {
			a[i] = new Student();
			return a[i]; 
		}}
		return null;
	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = Student.creObj();
		Student s2 = Student.creObj();
		s2.ID = 999;
		System.out.println(s1.ID );
		System.out.println(s2.ID );

	}

}



