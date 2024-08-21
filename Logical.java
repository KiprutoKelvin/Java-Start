public class Logical {

    public static void main(String[] args) {
        // // int x = 7;
        // // int y = 5;
        // int a = 5;
        // int b = 9;

        // // boolean result = x > y || a < b || a > 1;
        // boolean result = a > b;
        // System.out.println(!result);

/*
 * Exception Handling
 * Using Try Catch
 */
        int i = 0;
        int j = 0;

        try 
        {
            j = 18/i;    
        } 
        catch (Exception e) 
        {
            System.out.println("Something Went Wrong...");
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}