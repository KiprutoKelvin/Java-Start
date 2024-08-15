/**
 * Trial1
 * Abstract and Anonymous Inner Class
 */
abstract class Ab
{
    public abstract void show();
    public abstract void config();
}
// class B extends A{

//     // @Override
//     public void show() {
//         System.out.println("In B Show");
//     }

// }
public class Trial1 
{
    public static void main(String[] args) {
        Ab obj = new Ab() 
        {
            public void show() 
            {
                System.out.println("In new B Show");
            }

            // @Override
            public void config() {
                System.out.println("In Config");
            }
        
        };
        // A obj = new B();
        obj.show();
        obj.config();
    }
    
}