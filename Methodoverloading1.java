class Employee
{
    void salary()
    {
        System.out.println("salary=10000");
    }
    void salary(int a)
    {
        System.out.println(a);
    }
    void salary(int a, double b)
    {
        System.out.println(a+" "+b);
    }
    void salary(double a)
    {
        System.out.println(a);
    }
}
public class Methodoverloading1 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.salary();
        e.salary(2000);
        e.salary(10000,20000.00);
        e.salary(30000.00);
    }
    
}
