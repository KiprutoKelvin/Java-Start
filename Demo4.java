import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
public class Demo4 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,5,7,2,8);

        /*It's not difficult it's just unfamiliar */
        int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);

        Stream<Integer> sortedValues = nums.stream()
                        .filter(n -> n%2==0)
                        .sorted();
        
        sortedValues.forEach(n -> System.out.println(n));
        System.out.println();
        System.out.println(result);
    }
}