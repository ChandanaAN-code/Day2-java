class User
{
    private int amount=0;
    void getter()
    {
        System.out.println(amount);
    }
    void setter(int num)
    { 
        amount=num;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        User us=new User();
        us.getter();
        us.setter(100);
        us.getter();
    }
    
}
