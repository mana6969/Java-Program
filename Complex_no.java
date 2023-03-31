import java.util.*;
class Complex{
    int real,imag;
    void input(int x,int y)
    {
        real=x;
        imag=y;
    }
    void display()
    {
        System.out.println(real + "+" + imag + "i");
    }
}
public class Complex_no {
    public static void main(String []args){
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex c3=new Complex();
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Input First Complex Number\n2.Input Second Complex Number\n3.Display First Complex Number\n4.Display Second Complex Number\n5.Addition\n6.Substraction\n7.Multiplication\n8.Divison\n9.Exit");
            System.out.println("Enter Choice:-");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:int x,y;
                        x=sc.nextInt();
                        y=sc.nextInt();
                        c1.input(x,y);
                break;
                case 2:int a,b;
                         a=sc.nextInt();
                        b=sc.nextInt();
                       c2.input(a,b);
                break;
                case 3:c1.display();
                break;
                case 4:c2.display();
                break;
                case 5:c3.real=c1.real+c2.real;
                        c3.imag=c1.imag+c2.imag;
                        c3.display();
                break;
                case 6:c3.real=c1.real-c2.real;
                       c3.imag=c1.imag-c2.imag;
                       c3.display();
                break;
                case 7:c3.real=((c1.real*c2.real)-(c1.imag*c2.imag));
                        c3.imag=((c1.real*c2.imag)+(c1.imag*c2.real));
                        c3.display();
                break;
                case 8:c3.real=((c1.real*c2.real)+(c1.imag*c2.imag))/((c2.real*c2.real)+(c2.imag*c2.imag));
                        c3.imag=((c1.imag*c2.real)-(c2.imag*c1.real))/((c2.real*c2.real)+(c2.imag*c2.imag));
                        c3.display();
                break;
                case 9:System.out.println("Exiting...");
                        System.exit(0);
                break;
                default:System.out.println("Please Enter Valid Choice....");
            }

        }while(true);
    }
}
