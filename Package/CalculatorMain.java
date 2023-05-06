import calculator.*;
import java.util.*;
class CalculatorMain
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any two Numbers:");

		Calculation obj = new Calculation(s.nextInt(),s.nextInt());

		while(true)
		{
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Divison\n5.Exit");

			int choice = s.nextInt();

			switch(choice)
			{
				case 1:obj.add();
				break;
				case 2:obj.sub();
				break;
				case 3:obj.mul();
				break;
				case 4:obj.div();
				break;
				case 5:System.out.println("Thank You...");
				System.exit(0);
				default:System.out.println("Please Enter Valid Choice...!!");
			}
		}
	}
}