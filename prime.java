import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class prime 
{
    public static void main(String []args)
    {
        int num,i,flag;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check prime or not : ");
        num=sc.nextInt();
        if(num==1)
        {
            System.out.println("Prime");
        }
        else
        {
            flag=0;
            for(i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    flag=flag+1;
                }
            }
            if(flag==2)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not a Prime");
            }
        }
    }    
}
