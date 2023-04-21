import java.util.Scanner;
public class Institution extends University
{
	String Inst_Name;
	String Inst_Address;
	String Affliation_Id;
	String Affliation_Year;

	Scanner sc = new Scanner(System.in);

	void Inst_Input()
	{
		System.out.println("enter institute name:");
		Inst_Name=sc.nextLine();
		System.out.println("enter Inst_Address:");
		Inst_Address=sc.nextLine();
		System.out.println("enter Affliation_Id:");
		Affliation_Id=sc.nextLine();
		System.out.println("enter Affliation_Year:");
		Affliation_Year=sc.nextLine();
		Uni_Input();
	}
	void Inst_Display()
	{
		System.out.println("Institution Name-"+Inst_Name+"\nAddress-"+Inst_Address+"\nAffliation Id-"+Affliation_Id+"\nAffliation Year-"+Affliation_Year);
		Uni_Display();
	}
}