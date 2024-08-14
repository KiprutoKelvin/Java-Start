/**
 * Demo3 
 * Inner Class
 */
class Ai
{
    int age;

    public void show()
    {
        System.out.println("In Show");
    }

    // class Bi
    static class Bi
    {
        public void config()
        {
            System.out.println("In Config");
        }
    }

}
public class Demo3 
{
    public static void main(String[] args) {
        Ai obj = new Ai();
        obj.show();

        // Ai.Bi obj1 = obj.new Bi();
        Ai.Bi obj1 = new Ai.Bi();
        obj1.config();
    }

    
}