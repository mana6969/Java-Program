import java.util.Scanner;
public class Person extends District{

    public String P_Name;
    public String Mob_No;

    Scanner s = new Scanner(System.in);
    
    public void P_Input()
    {
        System.out.println("Enter Person Name:");
        P_Name=s.nextLine();
        System.out.println("Enter Mobile Number:");
        Mob_No=s.nextLine();
        D_Input();
    }

    public void P_Display()
    {
        System.out.println("\n\nPerson Name:" + P_Name + "\nMobile Numnber:" + Mob_No);
        D_Display();
    }
}
