class Students{
	int age=23;
	String name="krishi";
	double gpa=8.25;
	void details() {
		System.out.println(age+"|"+name+"|"+gpa);
	}
	Students(){
		int age=20;
		String name="vidhya";
		double gpa=7.25;
		System.out.println(age+"|"+name+"|"+gpa);
		
	}
}
public class Constructor {

	public static void main(String[] args) {
		Students s1=new Students();
		Students s2=new Students();
		s1.details();
		s2.details();
		// TODO Auto-generated method stub

	}

}
