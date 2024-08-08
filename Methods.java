/**
 * Methods in java
 */
// class Computer{
//     public void playMusic()
//     {
//         System.out.println("Music Playing...");
//     }

//     public String getMeAPen(int cost)
//     {
//         if(cost >= 10)
//             return "Pen";
        
//         return "Nothing";
//     }
// }
// public class Methods {
//     public static void main(String[] args) {
//         Computer obj = new Computer();
//         obj.playMusic();
//         String str = obj.getMeAPen(11);
//         System.out.println(str);
//     }

    
// }

/**
 * Methods Overriding
 */

 class Calc
 {
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
 }
 class AdvCalc extends Calc
 {
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
 }
public class Methods 
{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(6, 2);
        System.out.println(r1);
    }
    
}

