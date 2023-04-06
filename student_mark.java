import java.util.*;
public class student_mark {    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int mark;
        System.out.println("Enter 1 or 0 :");
        int Choice=sc.nextInt();
        switch(Choice)
        {
            case 0:System.out.println("Existing...");
                    System.exit(0);
            break;
            case 1:System.out.println("Enter Mark :-");
                    mark=sc.nextInt();
                    if(mark>=90)
                    System.out.println("This is Good");
                    else if(mark<=89 && mark>=60)
                    System.out.println("This is also Good");
                    else if(mark<=59 && mark>=0)
                    System.out.println("This is Good as well");
                    break;
            default:System.out.println("Enter valid choice...");
        }
    }
}
