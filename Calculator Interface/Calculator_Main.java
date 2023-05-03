import java.util.*;
interface Calculator
{
	void add();
	void sub();
	void mul();
	void div();
	void mod();
	void input();
} 

class Calculator1 implements Calculator
{
	double x,y;
	Scanner s = new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter any two number:");
		x = s.nextDouble();
		y = s.nextDouble();
	}
	public void add()
	{
		System.out.println("Sum is:" + (x+y));		
	}
	public void sub()
	{
		System.out.println("Substraction is:" + (x-y));
	}
	public void mul()
	{
		System.out.println("Multiplication is:" + (x*y));
	}
	public void div()
	{
		System.out.println("Divison is:" + (x/y));
	}	
	public void mod()
	{
		System.out.println("Modulo is:" + (x%y));
	}
}

class Calculator_Main
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		Calculator1 c = new Calculator1();
		c.input();
		while(true)
		{
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Divison\n5.Modulo\n6.Exit");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1:c.add();
				break;
				case 2:c.sub();
				break;
				case 3:c.mul();
				break;
				case 4:c.div();
				break;
				case 5:c.mod();
				break;
				case 6:System.out.println("Thank You..");	
				System.exit(0);
				default:System.out.println("Please Enter Valid Choice...!!");
			} 
		}
	}
}