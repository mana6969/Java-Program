import java.util.Scanner;
public class Student extends Institution
{
	String S_RegdNo;
	String S_Name;
	String DOB;
	String Address;
	String S_Enroll_Year;

	Scanner sc = new Scanner(System.in);

	void S_Input()
	{
		System.out.println("enter reg no:");
		S_RegdNo=sc.nextLine();
		System.out.println("enter name:");
		S_Name=sc.nextLine();
		System.out.println("enter date of birth");
		DOB=sc.nextLine();
		System.out.println("enter address:");
		Address=sc.nextLine();
		System.out.println("enrollemnt year:");
		S_Enroll_Year=sc.nextLine();
		Inst_Input();
	}
	void S_Display()
	{
		System.out.println("Student Regd No-"+S_RegdNo+"\nStudent Name-"+S_Name+"\nStudent DOB-"+DOB+"\nStudent Address-"+Address+"\nStudent Enrollment No-"+S_Enroll_Year);
		Inst_Display();
	}
}