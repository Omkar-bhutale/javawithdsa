

public class ArrayIndexException {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
     try{
        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]);
        }
    }
   // catch(Exception e)
   //ArrayIndexOutOfBoundsException is subclass of Exception
   catch(ArrayIndexOutOfBoundsException e){
        System.out.println("plz enter the proper array length to traverse "+e);
    }
    System.out.println("normal flow of program to end the program");
    }

    
}
