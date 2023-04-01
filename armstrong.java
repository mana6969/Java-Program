import java.util.*;
import java.lang.Math;
public class armstrong 
{
    public static void main(String[] args)
    {
        int num,rem,sum,count,temp,flag;
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        temp=num;
        flag=num;
        count=0;
        while(num>0)
        {
            num=num/10;
            count=count+1;
        }
        sum=0;
        while(temp>0)
        {
            rem=temp%10;
            sum+=Math.pow(rem,count);
            temp=temp/10;
        }
        if(sum==flag)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not a Armstrong");
        }
    }
}