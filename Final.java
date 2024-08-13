/**
 * Final Keyword
 */
// final -variable, method, class
class CalcF
{
    public void show()
    {
        System.out.println("In CalcF Show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalcF extends CalcF
{
    public void show()
    {
        System.out.println("By Doe");
    }
}
public class Final {
    public static void main(String[] args) {
        final int num = 9;
        // num = 12;
        System.out.println(num);

        CalcF obj = new CalcF();
        obj.show();
        obj.add(6, 7);

        AdvCalcF obj1 = new AdvCalcF();
        obj1.show();
        obj1.add(9, 8);
        
    }

    
}

/*
 * final variable- makes variable constant
 * final class - no class extension (stops inherintance)
 * final method - no method overriding
 */