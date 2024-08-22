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
 * Multiple Catch
 */
        int i = 2;
        int j = 0;

        int nums[] = new int[6];
        String str = null;

        try 
        {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[6]);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..." + e);
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}