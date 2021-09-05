import java.util.Scanner;

public class IfElseLadderDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter age");
		int age=scanner.nextInt();
		if(age<0)
		{
			System.out.println("invalid age");
		}
		else if(age<18)
		{
			System.out.println("you are a minor");
		}
		else
		{
			System.out.println("you are a major");
		}
		System.out.println("bye");
		// TODO Auto-generated method stub

	}

}
