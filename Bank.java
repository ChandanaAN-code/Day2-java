import java.util.Scanner;
class BankAccount{
    void deposit(int amount)
    {
        System.out.println(amount);
    }
    void deposit(double amount)
    {
        System.out.println(amount);
    }
    void deposit(int amount,String description)
    {
        System.out.println(amount);
        System.out.println(description);
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount ba=new BankAccount();
        System.out.println("Enter amount :");
        int a=sc.nextInt();
        double d=a;
        sc.nextLine();
        System.out.println("Enter description:");
        String b=sc.nextLine();
        ba.deposit(a);
        ba.deposit(d);
        ba.deposit(a,b);


    }
    
}
