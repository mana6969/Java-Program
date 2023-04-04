import java.util.*;
public class palindrome
{
    public static void main(String []args)
    {
        int num,temp,rem,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check palindrome : ");
        num=sc.nextInt();
        temp=num;
        rev=0;
        while(num>0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
