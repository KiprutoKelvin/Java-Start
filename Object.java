// Object Oriented Programing
// Object - Properties and Behaviours
// Class

class Calculator{
    int a;

    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}
class Laptop
{
    String model;
    int price;

    // public String toString()
    // {
    //     // return "Salut";
    //     return model + " : " + price;
    // }
    // public boolean equals(Laptop that)
    // {
    //     // if(this.model.equals(that.model) && this.price == that.price)
    //     //     return true;
    //     // else
    //     //     return false;

    //     return this.model.equals(that.model) && this.price == that.price;
        
    // }

    @Override  // Annotations
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    } 
}
public class Object {

    public static void main(String[] args) {
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        // int result = num1 + num2;

        System.out.println(result);

        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1200;

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1200;

        // boolean result1 = obj == obj1;
        boolean result1 = obj.equals(obj1);

        // System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(result1);
    }
}