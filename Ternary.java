/**
 * Abstract keyword
 */

abstract class Car // Abstract class
{
    public abstract void drive(); // Declaring a method
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Play Music");
    }
}
abstract class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
//     public void fly()
//     {
//         System.out.println("Flying...");
//     }
}
class UpdatedWagonR extends WagonR // Concrete class
{

    @Override
    public void fly() {
        System.out.println("Flying...");
        // throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    
}
public class Ternary {

    public static void main(String a[])
    {
        int n = 6;
        int result = 0;

        // if (n%2==0)
        //     result = 10;
        // else
        //     result = 20;
        
        result = n%2==0 ? 10 : 20;

        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();

        System.out.println(result);
    }
}