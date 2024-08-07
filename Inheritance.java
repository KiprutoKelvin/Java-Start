/**
 * Inheritance
 */
class Aa // extends Object
{
    public Aa()
    {
        super();
        System.out.println("In Aa");
    }
    public Aa(int n)
    {
        super();
        System.out.println("In Aa int");
    }
}
class Bb extends Aa
{
    public Bb()
    {
        super(7);
        System.out.println("In Bb");
    }
    public Bb(int n)
    {
        super(n); 
        System.out.println("In Bb int");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Calc obj = new Calc();
        // AdvCalc obj = new AdvCalc();
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(7, 3);
        int r2 = obj.sub(15, 9);
        int r3 = obj.multi(5, 7);
        int r4 = obj.div(16, 5);
        double r5 = obj.power(4, 4);

        System.out.println(r1 + " " + r2 + " " +  r3 + " " + r4 + " " + r5);

        // Bb obj1 = new Bb();
        // Bb obj1 = new Bb(6);
        Bb obj1 = new Bb();
    }

    
}