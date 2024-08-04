/**
 * StaticBlock
 */
class Mobile
{
    String brand;
    int price;
    String name;
    String system;
    static String material; // Static variables are shared by all the objects

    // Class loads then Objects get instantiated
    static
    {
        material = "Carbon";
        System.out.println("In Static Block");
    }

    public Mobile()
    {
        brand = "";
        price = 250;
        System.out.println("In Constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name + " : " + system + " : " + material);
    }

}
public class StaticBlock {
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
        
    }

    
}