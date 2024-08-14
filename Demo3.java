/**
 * Demo3 
 * Inner Class
 */
// class Ai
// {
//     int age;

//     public void show()
//     {
//         System.out.println("In Show");
//     }

//     // class Bi
//     static class Bi
//     {
//         public void config()
//         {
//             System.out.println("In Config");
//         }
//     }

// }
// public class Demo3 
// {
//     public static void main(String[] args) {
//         Ai obj = new Ai();
//         obj.show();

//         // Ai.Bi obj1 = obj.new Bi();
//         Ai.Bi obj1 = new Ai.Bi();
//         obj1.config();
//     }

    
// }

/*
 * Anonymous Inner Class
 */
class An
{
    public void show()
    {
        System.out.println("In An Show");
    }
}
// class Bn extends An
// {
//     public void show()
//     {
//         System.out.println("In Bn Show");
//     }
// }
public class Demo3 
{
    public static void main(String[] args) {
        An obj = new An()
        // Anonymous Inner Class
        {
            public void show()
            {
                System.out.println("In new Show");
            }
        };
        obj.show();
    }

    
}