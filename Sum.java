import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            int num=0,n1=0,n2=1,sum=0;
            while(num<=n)
            {
                if(num%2==0)
                {
                    sum+=num;
                }
                num=n1+n2;
                n1=n2;
                n2=num;
            }
            System.out.println(sum);
        }
    }
}
