/**
 * Enum
 */
enum Status{
    Running, Failed, Pending, Success;
}
public class Enum {
    public static void main(String[] args) 
    {
        int i = 6;
        // Status s = Status.Running;
        Status[] ss = Status.values();
        // System.out.println(s.ordinal());
        // System.out.println(ss[0]);

        for(Status s : ss)
        {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}