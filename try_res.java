import java.util.InputMismatchException;
import java.util.Scanner;

class try_res{
    public static void main(String[] args) {
        int num = 0;
       // Scanner sc = new Scanner(System.in);//created a resources
        try(Scanner sc = new Scanner(System.in);//upgraded versiion of finally
        ){
        num = sc.nextInt();
        //sc.close();
        }catch(InputMismatchException e){
            System.out.println("enter the number");
            //sc.close();
        }//finally{
        //     sc.close();
        // }
        System.out.println(num);
    }
}//Dry do not repet yourself