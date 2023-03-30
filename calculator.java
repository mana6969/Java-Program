import java.util.*;
class calculator{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter Choice : ");
        System.out.println("1.Add\n2.Substraction\n3.Multiplication\n4.Divison\n5.Modulo");
        int Choice=sc.nextInt();
        switch(Choice){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            case 5:System.out.println(a%b);
            break;
            default:System.out.println("Invalid Choice...");
        }
    }
}