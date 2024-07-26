public class Ternary {

    public static void main(String a[])
    {
        int n = 6;
        int result = 0;

        // if (n%2==0)
        //     result = 10;
        // else
        //     result = 20;
        
        result = n%2==0 ? 10 : 20;

        System.out.println(result);
    }
}