import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
public class Demo4 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,5,7,2,8);
        // Normal for loop
        // for(int i=0;i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));
        // }
        
        // Enhanced for loop
        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }

        // forEach Method
        // nums.forEach(n -> System.out.println(n));

        // int sum = 0;
        // for(int n: nums)
        // {
        //     if(n%2==0)
        //     {
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        /*It's not difficult it's just unfamiliar */
        int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);
       
        System.out.println(result);

        // s3.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n));
       // nums.forEach(n -> System.out.println(n));
    }
}