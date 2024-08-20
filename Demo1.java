import other.*;

/**
 * Demo1
 */
// class A
// {
//     public void show()
//     {
//         System.out.println("In A show");
//     }
// }
// class B extends A
// {   
//     @Override
//     public void show()
//     {
//         System.out.println("In B show");
//     }
// }
@FunctionalInterface
interface A
{
    void show(int i);
}
// class B implements A
// {
//     public void show()
//     {
//         System.out.println("In Show");
//     }
// }
public class Demo1 {

    public static void main(String[] args) 
    {
        // Ac obj = new Ac();
        // System.out.println(obj.marks);

        A obj =  i -> System.out.println("In Show " + i);

        obj.show(5);
    }
}