/**
 * Dev
 * Need for Interface
 */
interface Computer
{
     void code();
}
 class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code, Compile, Run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, Compile, Run, Faster");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
public class Dev {
    public static void main(String[] args) 
    {   
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer kipruto = new Developer();
        kipruto.devApp(lap);
        kipruto.devApp(desk);
    }

    
}