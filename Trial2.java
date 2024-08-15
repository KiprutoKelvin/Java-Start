/**
 * Trial2 
 *  Interface
 */
interface A
{
    int age=60;    // Final and Static
    String area="Kenya";

    void show();
    void config();
}
class B implements A
{
    public void show()
    {
        System.out.println("In Show");
    }
    public void config()
    {
        System.out.println("In Config");
    }
}
public interface Trial2 {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        // {

        //     // @Override
        //     public void show() {
        //        System.out.println("In Show");
        //     }

        //     // @Override
        //     public void config() {
        //         System.out.println("In Config");
        //     }
            
        // };
        obj.show();
        obj.config();
        
        System.out.println(A.age);
    }

    
}