import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Kipruto", 21);
        students.put("Mambet", 93);
        students.put("Bungei", 75);
        students.put("Koech", 68);

        System.out.println(students);
        System.out.println(students.get("Koech"));
        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
    }
}