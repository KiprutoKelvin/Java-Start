/**
 * Trial2 
 * Interface
 * class - class -> extends
 * class - interface -> implements
 * interface - interface -> extends
 */
interface A
{
    int age=60;    // Final and Static
    String area="Kenya";

    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X
{

}
class B implements A,X
{
    public void show()
    {
        System.out.println("In Show");
    }
    public void config()
    {
        System.out.println("In Config");
    }
   public void run()
   {
        System.out.println("Running...");
   }
}
public interface Trial2 {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        // {

        //     
        //     public void show() {
        //        System.out.println("In Show");
        //     }

        //     
        //     public void config() {
        //         System.out.println("In Config");
        //     }
            
        // };
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();
             
        System.out.println(A.age);
    }

    
}