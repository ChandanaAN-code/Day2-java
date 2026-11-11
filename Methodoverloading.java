class User
{
    void name(int a)
    {
        System.out.println("Function1");

    }
    void name()
    {
        System.out.println("Function2");
    }
    void name(int a,int b)
    {
        System.out.println("Function3");

    }
    void name(double a)
    {
        System.out.println("Function 4");
    }

}
public class Methodoverloading {
    public static void main(String[] args) {
        User us=new User();
        us.name(10);
        us.name();
        us.name(10,20);
        us.name(2.098);
        
    }
    
}
