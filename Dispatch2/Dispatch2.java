//Dynamic Method Dispatch
class A {
    int x;
    A(int x)
    {
        this.x=x;
    }
    void show()
    {
        System.out.println("Inside class A's show() method");
    }
}
class B extends A{
    int y;
    B(int x,int y)
    {
        super(x);
        this.y=y;
    }
    void show()         //Overrides the parent class show(), Method Overriding
    {
        //super.show();   //Calling super class show with super keyword
        System.out.println("Inside class B's show() method");
    }
}
class Dispatch2
{
    public static void main(String []args)
    {
        A a;                        //Parent class object declared
        A a2 = new A(10);         //Parent class object instantiated
        B b = new B(10,20);     //child class object instantiated
        a=a2;                       //Parent class object a refers to the a2
        a.show();                   //a2.show
        a=b;
        a.show();
        //b.show();       //show() of the child class will execute 
    }
}
