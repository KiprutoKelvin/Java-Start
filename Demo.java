// public class Demo {

//     public static void main(String[] args) {
        
//         double x = 8.8;
//         double y = 9.8;

//         // int a = 8;
//         // int b 

//         boolean result = x >= y;

//         System.out.println(result);
//     }
// }

/** Naming Convention **/ 

// camelCasing
// Class and Interface start with capital - Capital 
// variable and methods  e.g marks, show()
// CONSTANTS - PIE, BRAND


/**
 * Demo Anonymous Object
 */

 class A
 {
    public A()
    {
        System.out.println("Object Created");
    }
    public void show()
    {
        System.out.println("In a Show");
    }
 }

public class Demo 
{
    public static void main(String[] args) {
        // int marks;
        // marks = 99;
        
        // A obj;
        // obj = new A();
        // obj.show();

        new A(); // Anonymous Object - you cant reuse them
        new A().show();
    }

    
}