class H{
	int a;
	String b;
	double c;
	H(){}
	H(int a,String b){
		this.a=a;
		this.b=b;
	}
	H(int a,String b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void Vidhya() {
		System.out.println(a+"|"+b+"|"+c);
	}
	
	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		H N1=new H();
		H N2=new H(20,"krishi",80.6);
		H N3=new H(18,"vidhya");
		N1.Vidhya();
		N2.Vidhya();
		N3.Vidhya();
		
		// TODO Auto-generated method stub

	}

}
