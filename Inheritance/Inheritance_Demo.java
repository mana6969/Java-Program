class Inheritance_Demo {
    public static void main(String []args) {
        // TODO Auto-generated method stub
        Parent p=new Parent();
        Child c=new Child();
        p.x=10; p.y=20;
        c.x=30; c.y=40; c.z=50;
        //p.Parent_display();
        //c.Parent_display();
        c.Child_display();
        p.Parent_display();
    }
}
