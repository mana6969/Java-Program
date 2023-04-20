import java.util.Scanner;
public class District extends State{
    public String D_Name;

    Scanner s = new Scanner(System.in);

    public void D_Input()
    {
        System.out.println("Enter District Name:");
        D_Name=s.nextLine();
        S_Input();
    }

    public void D_Display()
    {
        System.out.println("District:" + D_Name);
        S_Display();
    }
}
