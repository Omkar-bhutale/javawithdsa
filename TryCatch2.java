public class TryCatch2 {
    public static void main(String[] args) {
        int a=5;
        int b =5;
        int result=0;
        int c=5;
        try{
         result=a/(b-c);
        }
        catch(Exception e){
            System.out.println("plz enter the properr value");
        }
        finally{
            System.out.println("I am in final block");
        }
    }
    
}
