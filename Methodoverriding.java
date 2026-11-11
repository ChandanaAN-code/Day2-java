class User{
    void name()
    {
        System.out.println("Function1");
    }

}
class User1 extends User{
    void name()
    {
        {
            System.out.println("Function2");
        }
    }
}
public class Methodoverriding {
    public static void main(String[] args) {
    User us=new User();
    us.name();
    User1 us1=new User1();
    us1.name();
    
}
}
