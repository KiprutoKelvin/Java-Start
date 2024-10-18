import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

    public static void main(String[] args) 
    {
        /* Using Collection */
        Collection<Integer> numb = new TreeSet<Integer>();
        numb.add(6);
        numb.add(5);
        numb.add(9);
        numb.add(7);

        System.out.println("Using Collection (TreeSet)");

        Iterator<Integer> values = numb.iterator();

        while (values.hasNext()) 
            System.out.println(values.next());
        
        System.out.println();

    /* Using List */
        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(6);
        // nums.add(5);
        // nums.add(9);
        // nums.add(7);
        // nums.add(6);

        // for(Integer n : nums)
        // {
        //     int num = n;
        //     System.out.println(num*2);
        // }
        // System.out.println(nums.get(3));
    
    /* Using Set 
     * HashSet-Doesn't have a sorted format
     * TreeSet-Sorted Set
     */
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(60);
        nums.add(59);
        nums.add(98);
        nums.add(75);
        
        System.out.println("Using Set (TreeSet)");
        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}