/**
 * Trial2 
 * Interface
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
        
        System.out.println(A.age);
    }

    
}