
// class Computer//--last
// {
//     void compileCode(){}
    
// }
// abstract class Computer//5
// {
//     abstract void compileCode();
    
// }
interface Computer//6
{
    abstract void compileCode();
    
}

//class Laptop extends Computer//--5
class Laptop implements Computer//6

{
    public void compileCode()
    {
        System.out.println("you got 5 errors");
    }
}
// class Desktop /*--4*/ extends Computer//--5
class Desktop  implements Computer//6

{
    public void compileCode()
    {
        System.out.println("you got 5 errors, faster");
    }
}
class Developer
{    // Laptop ref = new Laptop();  --2
    //public void buildApp(Laptop ref)//--4
    public void buildApp(Computer ref)//--4.3

    {
        System.out.println("Building App");
       // Laptop ref = new Laptop(); ---1
        ref.compileCode();
    }  
}
 public class ImpOfIntr 
 {
    public static void main(String[] args) {
        Developer dev = new Developer();
        //Laptop obj = new Laptop();//--3
        Desktop obj = new Desktop();
        dev.buildApp(obj);
    }

 }

            
