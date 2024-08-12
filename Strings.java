/**
 * Strings
 */
class Ac
{

}
class Bc extends Ac
{

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

    }
}