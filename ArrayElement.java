import java.util.*;
public class ArrayElement
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Size:");
        int size = s.nextInt();
        int[] E=new int[size];
        int i;
        System.out.println("Input:");
        for(i=0;i<size;i++)
        {
            E[i] = s.nextInt();
        }
        /*System.out.println("Output:");
        for(i=0;i<size;i++)
        {
            System.out.println(E[i]);
        }*/
        System.out.println("Element For Search:");
        int EL=s.nextInt();
        for(i=0;i<size;i++)
        {
            if(E[i]==EL)
            System.out.println("Element Present At Index:" + i);
        }
    }
}