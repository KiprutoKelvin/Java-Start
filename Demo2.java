/**
 * Demo2 Dynamic Method Dispatch
 */
class Computer
{

}
class Laptop extends Computer
{

}
class Ap
{
    public void show()
    {
        System.out.println("In Ap Show");
    }
}
class Bp extends Ap
{
    public void show()
    {
        System.out.println("In Bp Show");
    }
}
class Cp extends Ap
{
    public void show()
    {
        System.out.println("In Cp Show");
    }

}
public class Demo2 {
    public static void main(String[] args) {
        Ap obj = new Ap();
        // Bp obj = new Bp();
        obj.show();

        obj = new Bp();
        obj.show();

        obj = new Cp();
        obj.show();

        Computer obj1 = new Laptop();
        // Laptop obj1 = new Laptop();
        
    }
    
}
// Runtime polymorphism