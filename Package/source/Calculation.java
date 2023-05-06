package calculator;

public class Calculation
{
	private int a;
	private int b;
	
	public Calculation(int a, int b)
	{
		this.a = a;
		this.b = b;	
	}

	public void add()
	{
		System.out.println(a+b);		
	}
	public void sub()
	{
		System.out.println(a-b);		
	}
	public void mul()
	{
		System.out.println(a*b);		
	}
	public void div()
	{
		System.out.println(a/b);		
	}
}