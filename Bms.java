import java.util.Scanner;
class User
{
    private long accno;
    private String accholder;
    private double balance;
    void setter(long a,String holder,double bal)
    {
        accno = a;
        accholder = holder;
        balance = bal;
    }
    void getter()
    {
        System.out.println("-------Bank Account Details---");
        System.out.println("Account Holder Name:"+accholder);
        System.out.println("Account Number:"+accno);
        System.out.println("Account Balance:"+balance);
    }

    void getter1()
    {
      System.out.println("------Update Account Number------");
      System.out.println("Updated Account Number:"+accno);
      System.out.println("-------Updated Account Details-------");
      System.out.println("Account Holder Name:"+accholder);
      System.out.println("Account Number:"+accno);
      System.out.println("Account Balance:"+balance);
    }
    void setter(long ac)
    {
        accno=ac;
    }

}
public class Bms{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("Enter Account Holder Name:");
        String h = sc.next();
        System.out.println("Enter Account Number:");
        long acc = sc.nextLong();
        System.out.println("Enter Account Balance:");
        double b = sc.nextDouble();
        System.out.println("Enter New Account Number:");
        long upacc =sc.nextLong();
        u.setter(acc, h, b);
        u.getter();
        u.setter(upacc);
        u.getter1();

    }

}