import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter age");
		int age=scanner.nextInt();
		if(age>=0)
		{
			if(age<18)
			{
				System.out.println("you are a minor");
			}
			else
			{
				System.out.println("you are a major");
			}}
		   else
			{
				System.out.println("invalid age");
			}
		}
		// TODO Auto-generated method stub

	}



