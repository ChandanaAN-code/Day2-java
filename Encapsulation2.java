class Student
{
    private int id;
    void getter()
    {
        System.out.println(id);
    }
    void setter(int i)
    {
        id=i;
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setter(89056);
        s.getter();
    }
    
}
