import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Wrappers
 */
public class Wrappers {

    public static void main(String[] args) throws IOException {
        // int num = 7;
        // // Integer num1 = new Integer(5);
        // // Integer num1 = new Integer(num); // Boxing
        // Integer num1 = num; // Autoboxing
        // // Integer num1 = 5;

        // int num2 = num1.intValue(); // Unboxing - getting from object type to primitive type
        // // int num2 = num1; // Auto-unboxing

        // String str = "19";
        // int num3 = Integer.parseInt(str);

        // System.out.println(num3*2);
        // System.out.println(num1);
        // System.out.println(num2);

        // System.out.println("Enter a number");
        /* 1st Method */
        // int numb = System.in.read();
        // System.out.println(numb - 48);

        /* 2st Method */
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf  = new BufferedReader(in);
        
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close(); //Closing Resource

        /* 3rd Method */
        // Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        // System.out.println(num);

        int num = 0;
        try
        {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
        }
        finally
        {
            System.out.println("Bye"); 
        }
    }
}