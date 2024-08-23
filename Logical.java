/*
 * Exception Handling
 * Using Try Catch
 * Multiple Catch
 * Custom Exception
 * Ducking Exception
 */
class A{
    public void show() throws ClassNotFoundException
    {
        
        Class.forName("Demo11");
    
    }
}
class KiprutoException extends Exception
{
   public KiprutoException(String string)
   {
        super(string);
   }
}

public class Logical {

    static{
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {
        // // int x = 7;
        // // int y = 5;
        // int a = 5;
        // int b = 9;

        // // boolean result = x > y || a < b || a > 1;
        // boolean result = a > b;
        // System.out.println(!result);

        int i = 20;
        int j = 0;

        int nums[] = new int[6];
        String str = null;

        try 
        {
            j = 18/i;
            // System.out.println(str.length());
            // System.out.println(nums[1]);
            // System.out.println(nums[6]);
            if(j==0)
                throw new KiprutoException("Dont print Zero");
        } 
        catch (KiprutoException e)
        {
            j = 18/1;
            System.out.println("Thats the Default Output " + e);
            // System.out.println("Cannot divide by zero");
        }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("Stay in your limit");
        // }
        catch(Exception e)
        {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);

        System.out.println("Bye");

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
    }
}