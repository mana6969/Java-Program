import java.util.Scanner;
public class State {

    public String S_Name;

    Scanner s = new Scanner(System.in);

    public void S_Input()
    {
        System.out.println("Enter State Name:");
        S_Name=s.nextLine();
    }

    public void S_Display()
    {
        System.out.println("State:" + S_Name);
    } 
}
