/**
 * StaticMethod
 */
class Mobile
{
    String brand;
    int price;
    String name;
    String system;
    static String material; // Static variables are shared by all the objects

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name + " : " + system + " : " + material);
    }

    public static void show1(Mobile obj)
    {
        System.out.println("In Static Method");
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name + " : " + obj.system + " : " + material);
    }
}
public class StaticMethod {
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1900;
        obj1.name = "SmartPhone";
        obj1.system = "IphoneOS";
        // obj1.material = "Titanium";
        Mobile.material = "Titanium";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1600;
        obj2.name = "SmartPhone";
        obj2.system = "Android";
        // obj2.material = "Aluminium";
        Mobile.material = "Aluminium";

        Mobile.material = "Carbon"; // using class name

        obj1.show();
        obj2.show();

        Mobile.show1(obj1); // calling Static Methods directly
        
    }

    
}