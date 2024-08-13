/**
 * Strings
 */
class Ac
{
    public void show1()
    {
        System.out.println("In Ac Show");
    }
}
class Bc extends Ac
{
    public void show2()
    {
        System.out.println("In Bc Show");
    }
}
public class Strings {

    public static void main(String[] args) {
        // String name = new String("Kiru");
        // String name = "Kiru";
        // name = name + " Kipruto";

        // System.out.println("Salut " + name);

        // String s1 = "Neet";
        // String s2 = "Neet";

        // System.out.println(s1 == s2); //String constant pool

        // System.out.println("Guten Mogen " + name);
        // System.out.println(name.hashCode());
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" Kipruto"));


        // String Buffer
        StringBuffer sb = new StringBuffer("Kipruto");
        System.out.println(sb.length()); 
        sb.append(" Kelvin");
        System.out.println(sb);
        sb.insert(0, "Java ");
        System.out.println(sb);
        
        /* Type Casting */
        double d = 14.5;
        int i = (int)d;

        System.out.println(i);

        // Ac obj = new Ac();
        // Ac obj = (Ac) new Bc(); // Upcasting
        Ac obj = new Bc(); // Upcasting Happens by default
        obj.show1();

        Bc obj1 = (Bc) obj; // Downcasting
        obj1.show2();


    }
}