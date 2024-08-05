/**
 * Encapsulation
 */
class Human
{
    int age;
    String name;
}
public class Encapsulation 
{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.age = 18;
        obj.name = "Kipruto";

        System.out.println(obj.name);
    }

    
}