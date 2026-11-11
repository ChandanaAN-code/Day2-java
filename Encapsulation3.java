import java.util.Scanner;
class  Employee
{
    private String name;
    private int id;
    private double salary;
    void getter()
        {
            System.out.println(name);
            System.out.println(id);
            System.out.println(salary);
        }
    void setter(String n, int i, double s)
    {
        name=n;
        id=i;
        salary=s;                                                                                                                                                                                                                                                                                 
    }
}
public class Encapsulation3 {
    public static void main(String[] args) {
        Employee e= new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String a=sc.nextLine();
        System.out.println("Enter Id:");
        int b=sc.nextInt();
        System.out.println("Enter Salary:");;
        double c=sc.nextDouble();
        e.setter(a,b,c);
        e.getter();
        
    }
    
}
