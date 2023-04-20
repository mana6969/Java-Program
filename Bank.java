import java.util.*;
class Bank
{
    String D_Name;
    Double A_No;
    String A_Type;
    Double Amount;
    double A,W;
    Scanner s = new Scanner(System.in);
    public void Input()
    {
        System.out.println("Enter Name of Depositor:");
        D_Name = s.nextLine();
        System.out.println("Enter Account Number:");
        A_No = s.nextDouble();
        s.nextLine();
        System.out.println("Enter type of Account:");
        A_Type = s.nextLine();
        System.out.println("Enter Available Balance:");
        Amount = s.nextDouble();
    }
    public void Deposit()
    {
        System.out.println("Enter Amount for Deposite:");
        double A = s.nextDouble();
        Amount = Amount + A;
        System.out.println("Deposited");
    }
    public void Withdraw()
    {
        System.out.println("Enter Withdraw Amount:");
        double W = s.nextDouble();
        if(W>Amount)
        System.out.println("Insufficient Fund");
        else
        {
            Amount = Amount - W;
            System.out.println("Withdraw Successful");
        }
    }
    public void Balance()
    {
        System.out.println("Available Balance="+Amount);
    }
    public void Display()
    {
        System.out.println("Depositor Name:"+D_Name+"\nAccount Number:"+A_No+"\nType of Account:"+A_Type+"\nAmount:"+Amount);
    }

    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        Bank B = new Bank();
        do
        {
            System.out.println("1.Input Details\n2.Deposite\n3.Withdraw\n4.Check Balance\n5.Display Details\n6.Logout");
            System.out.println("Enter Choice");
            int Choice = s.nextInt();
            switch(Choice)
            {
                case 1:
                        B.Input();
                break;
                case 2:
                        B.Deposit();
                break;
                case 3:
                        B.Withdraw();
                break;
                case 4:
                        B.Balance();
                break;
                case 5:
                        B.Display();
                break;
                case 6:
                        System.out.println("Thank You...");
                        System.exit(0);
                default:
                        System.out.println("Please Enter Valid Choice..");
            }
        }
        while(true);
    }
}
