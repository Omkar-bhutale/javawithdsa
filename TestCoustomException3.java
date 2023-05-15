import java.util.Scanner;

class demo{
    static void message(String str) throws MyException1
    {  
        if(str.length()<8)
        throw new MyException1("plz enter the string of length greter then 8 char");
    

}
}
class MyException1 extends Exception{
    MyException1(String str){
        super(str);
    }
}

public class TestCoustomException3 {
    public static void main(String[] args) //throws Exception{
    {   
        System.out.println("string plz");
       try( Scanner sc = new Scanner(System.in)){
        //  demo.message("omi");
          String str = sc.nextLine();
          demo.message(str);
       }
       catch(MyException1 e){
       // str = "poo"
        System.err.println(e.getMessage());
        return;
       }
       
        
    }
    
}
