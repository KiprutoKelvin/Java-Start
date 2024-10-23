import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Mwanafunzi implements Comparable<Mwanafunzi>
{
    int age;
    String name;

    public Mwanafunzi(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Mwanafunzi [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Mwanafunzi that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }

    
}
public class Sort {

    public static void main(String[] args) {
        // Comparator<Integer> com = new Comparator<Integer>() 
        // {
        //     public int compare(Integer i, Integer j)
        //     {
        //         if(i%10 > j%10)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };
        
        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);

        // Collections.sort(nums,com);
        
        // System.out.println(nums);

        Comparator<Mwanafunzi> com = new Comparator<Mwanafunzi>() 
        {
            public int compare(Mwanafunzi i, Mwanafunzi j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Mwanafunzi> mwana = new ArrayList<>();
        mwana.add(new Mwanafunzi(21, "Kiprotich"));
        mwana.add(new Mwanafunzi(12, "Biwott"));
        mwana.add(new Mwanafunzi(18, "Meli"));
        mwana.add(new Mwanafunzi(20, "Chelugo"));

        Collections.sort(mwana, com);
        for(Mwanafunzi m : mwana)
        System.out.println(m);
    }
}