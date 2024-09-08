/**
 * Threads
 * Multiple Threads
 */
class At extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Salut");
        }
    }
}
class Bt extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Bonjour");
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        At obj1 = new At();
        Bt obj2 = new Bt();

        obj1.start();
        obj2.start();
    }

    
}