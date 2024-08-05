/**
 * Encapsulation
 */
class Human
{
    // private int age = 130;
    // private String name = "Kiru";
    private int age;
    private String name;

    // Getters and Setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
public class Encapsulation 
{
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 18;
        // obj.name = "Kipruto";

         obj.setAge(20);
        obj.setName("Kipruto");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }

    
}