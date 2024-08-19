/**
 * Enum
 */
enum Status{
    Running, Failed, Pending, Success;
}
public class Enum {
    public static void main(String[] args) 
    {
        // int i = 6;
        // // Status s = Status.Running;
        // Status[] ss = Status.values();
        // // System.out.println(s.ordinal());
        // // System.out.println(ss[0]);

        // for(Status s : ss)
        // {
        //     System.out.println(s + " : " + s.ordinal());
        // }

        Status s = Status.Running;

        switch (s) {
            case Success:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;
            
            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }

        // if(s == Status.Running)
        //     System.out.println("All Good");
        // else if(s == Status.Failed)
        //     System.out.println("Try Again");
        // else if (s == Status.Pending)
        //     System.out.println("Please Wait");
        // else
        // System.out.println("Done");
    }
}