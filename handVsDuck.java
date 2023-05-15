class demo{
    void a()throws ArithmeticException{
        b();
    }
    void b()throws ArithmeticException
    {
        int a=10;
        int b =0;
        System.out.println(a/b);
    }
}


public class handVsDuck {
    public static void main(String[] args) {
        demo d = new demo();
        //d.a();
        try{
            d.a();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("endhg");

    }
    
}
