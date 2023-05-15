
//program to demostrate try with multiple catch block
public class MultiCatch {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c =5;
        String Str = null;
        int arr[] ={1,2,3,4,5};
        int res=0;
        try{
            res = a/(c-b);
            res = c/Str.length();
            System.out.println(arr[arr.length]);


        }
        catch(ArithmeticException e){
            System.out.println("in arithmaticexception block"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("array index out of bound exceptin"+e);
          // System.out.println(e);

        }
        catch(NullPointerException e){
            System.out.println("in null pointer exception block  " + e);
        }

        catch(Exception e){//super class of exception classes is Excetpion
            System.out.println("something went wrong");
        }
    }    
}
