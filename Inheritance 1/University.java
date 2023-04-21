import java.util.Scanner;
public class University
{
	Scanner sc = new Scanner(System.in);
    String U_Name;
	String Course;
	String Address;
	String Estd_Year;

	void Uni_Input()
	{
		System.out.println("enter university name:");
		U_Name=sc.nextLine();
		System.out.println("enter course:");
		Course=sc.nextLine();
		System.out.println("enter address:");
		Address=sc.nextLine();
		System.out.println("enter estd. year:");
		Estd_Year=sc.nextLine();
	}
	void Uni_Display()
	{
		System.out.println("University Name-" + U_Name + "\nCourse-" + Course + "\nAddress-" + Address + "\nEstd Year-" + Estd_Year);
	}
}
