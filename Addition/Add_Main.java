import java.util.*;
abstract class Add
{
	abstract void Add2();
	abstract void Add3();
	abstract void Display();
}

class Addition
{
	Scanner s = new Scanner(System.in);
	int a,b,c;
	void Add2()
	{
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Sum:" +(a+b));	
	}
	void Add3()
	{
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println("Sum:" +(a+b+c));
	}
}

class Add_Main
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		Addition a = new Addition();
		while(true)
		{
			System.out.println("1.2 Num Addition\n2.3 Num Addition\n3.Exit");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:a.Add2();
				break;
				case 2:a.Add3();
				break;
				case 3:System.out.println("Thank You..");
				System.exit(0);
				default:System.out.println("Please Enter Valid Choice..!!");
			}
		}
	}
}