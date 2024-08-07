/**
 * Inheritance
 */

//  class Calc
//  {
//     public int add(int n1, int n2)
//     {
//         return n1 + n2;
//     }
//     public int sub(int n1, int n2)
//     {
//         return n1 - n2;
//     }
//  }

public class Inheritance {
    public static void main(String[] args) {
        // Calc obj = new Calc();
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(7, 3);
        int r2 = obj.sub(15, 9);
        int r3 = obj.multi(5, 7);
        int r4 = obj.div(16, 5);


        System.out.println(r1 + " " + r2 + " " +  r3 + " " + r4);
    }

    
}