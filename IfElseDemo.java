import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter age");
		int age=scanner.nextInt();
		if(age>=18)
		{
			System.out.println("you are a major");
		}
		else
		{
			System.out.println("you are a minor");
		}
		System.out.println("bye");
		// TODO Auto-generated method stub

	}

}
