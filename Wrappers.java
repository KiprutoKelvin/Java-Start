/**
 * Wrappers
 */
public class Wrappers {

    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(5);
        // Integer num1 = new Integer(num); // Boxing
        Integer num1 = num; // Autoboxing
        // Integer num1 = 5;

        int num2 = num1.intValue(); // Unboxing - getting from object type to primitive type
        // int num2 = num1; // Auto-unboxing

        String str = "19";
        int num3 = Integer.parseInt(str);

        System.out.println(num3*2);
        System.out.println(num1);
        System.out.println(num2);
    }
}