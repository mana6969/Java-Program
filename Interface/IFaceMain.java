interface IFace
{
    public void display();          //Abstract Method
    public void display1(); 
}
abstract class IMain implements IFace
{
    IMain()
    {
        System.out.println("Inside IMain Constuctor");
    }
    public void display()           //Defining the abstract method
    {
        System.out.println("Inside IFace Method");
    }
    //abstract public void display1();
}
class IFaceMain extends IMain
{
    IFaceMain()
    {
        System.out.println("Inside IFaceMain Constuctor");
    }
    public void display1()           //Defining the abstract method
    {
        System.out.println("Inside display1 in main class");
    }
    public void display()           //Defining the abstract method
    {
        System.out.println("Inside display Method in main class");
    }
    public static void main(String []args)
    {
        IFace obj;                  //Interface object declared
        obj = new IFaceMain();      //interface object refers to another
        obj.display();
        obj.display1();

        //new IFaceMain().display1();

        //IFaceMain obj1;
        //obj1 = new IFaceMain();
        //obj1.display();
        //obj1.display1();

        //IMain obj2;
        //obj2 = new IFaceMain();
        //obj2.display();
        //obj2.display1();
    }
}