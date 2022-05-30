import java.util.Scanner;
class clipkart
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to clipkart");
        System.out.println("Enter 1 for COD");
        System.out.println("Enter  2 for credit card");
        System.out.println("Enter 3  for upi");
        System.out.println("Enter 4  for netbanking");

        int opt=sc.nextInt();

        if(opt==1)
        {
            payment();
        }
        else if(opt==2)
        {
            System.out.println("Enter the card number");
            long card=sc.nextLong();
            System.out.println("Enter the cvv number");
            int cvv=sc.nextInt();
            System.out.println("Enter the Expdate");
            String exp= sc.next();
            payment(card,cvv,exp);
        }
        else if(opt==3)
        {
            System.out.println("enter the upi");
            String upi=sc.next();
            payment(upi);
        }
        else if(opt==4)
        {
            System.out.println("Enter the username");
            String user=sc.next();
            System.out.println("Enter the password");
            String pass=sc.next();
            payment(user,pass);
             
        }
        else{
            System.out.println("wrong unput");
        }


    }
    public static void payment()
    {
        System.out.println("cash on deleivery");
        System.out.println("order is placed");
    }
    public static void payment( long card,int cvv,String exp)
    {
        System.out.println("payment by credit card");
        System.out.println("order is placed");
    }
    public static void payment(String upi)
    {
        System.out.println("payment by upi");
        System.out.println("order is placed");
    }
    public  static void payment(String user,String pass)
    {
        System.out.println("payment by Netbanking");
        System.out.println("order is placed");
    } 
}