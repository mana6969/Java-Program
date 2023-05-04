import java.util.*;
class Greatest4
{
	public static void main(String []args)
	{
		int a,b,c,d;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter any 4 numbers : ");
		a=num.nextInt();
		b=num.nextInt();
		c=num.nextInt();
		d=num.nextInt();
		
		if(a>b&&a>c&&a>d)
			System.out.println("Greater is : " +a);
		else if(b>c&&b>d)
			System.out.println("Greater is : " +b);
		else if(c>d)
			System.out.println("Greater is : " +c);
		else
			System.out.println("Greater is : " +d);
	}
}