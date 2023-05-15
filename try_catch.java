public class try_catch {
    public static void main(String[] args) {
        int num1 = 7;
       // int num2 = 6_5;//==65//true
       int num2 =0;
        int result=0;
        try{
            System.out.println("in try block");

            result=num1/num2;
            //System.out.println("in try block");
         }
         //catch(Exception obj) //is same as
        // catch(RuntimeException obj){//same as
        //catch(ArithmeticException obj)
        //this is becouse arithmatic exception is sub class of RunTimeexception which is subclass of Exception
        catch(Exception obj) 
        {
            System.out.println("divide by zero excepton");
            System.out.println(obj);
         }
         System.out.println(result);
         System.out.println("by");

    }
    
}
