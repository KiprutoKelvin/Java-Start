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
    int add(int i, int j);
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

        A obj = (i, j) -> i+j;
            
        int result = obj.add(5,6);
        System.out.println(result);
    }
}