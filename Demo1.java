import other.*;

/**
 * Demo1
 */
class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{   
    @Override
    public void show()
    {
        System.out.println("In B show");
    }
}
public class Demo1 {

    public static void main(String[] args) 
    {
        // Ac obj = new Ac();
        // System.out.println(obj.marks);

        B obj = new B();
        obj.show();
    }
}