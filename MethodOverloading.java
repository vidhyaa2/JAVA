class S{
	void vidhya() {
		System.out.println("hi");
		
	}
	void vidhya(String a) {
		System.out.println("how are you");
	}
	void vidhya(String a,int b) {
		System.out.println("bye");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		S R=new S();
		R.vidhya();
		R.vidhya("hi",20);
		R.vidhya("bye");
		
		
		
		// TODO Auto-generated method stub

	}

}
