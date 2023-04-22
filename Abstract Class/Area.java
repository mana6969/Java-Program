import java.util.*;
class Rectangle extends Shape{
    int l,b;
    int area()
    {
        return l*b;
    }
}
class Triangle extends Shape{
    int h,b;
    int area()
    {
        return (h*b)/2;
    }
}
class Area{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        Rectangle R = new Rectangle();
        Triangle T = new Triangle();
        System.out.println("Enter length and breadth of Rectangle:");
        R.l=s.nextInt();
        R.b=s.nextInt();
        System.out.println("Area=" + R.area());
        System.out.println("Enter height and breadth of Triangle:");
        T.h=s.nextInt();
        T.b=s.nextInt();
        System.out.println("Area=" + T.area());
    }
}
