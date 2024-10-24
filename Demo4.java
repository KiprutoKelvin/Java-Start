import java.util.List;
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
        nums.forEach(n -> System.out.println(n));

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
    }
}