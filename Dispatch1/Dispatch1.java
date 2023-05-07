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
class C extends B {
    C(int x,int y)
    {
        super(x,y);
    }
    void show()
    {
        System.out.println("Inside class C's show() method");
    }
}
class Dispatch1
{
    public static void main(String []args)
    {
        A a = new A(10);
        a.show();
        a = new B(10,20);
        a.show();       //show() of the child class will execute 
        a = new C(10,20);
        a.show();

    }
}
