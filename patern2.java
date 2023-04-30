import java.util.Scanner;

public class patern2 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int rows;
          System.out.println("enter the number of rows");
          rows = in.nextInt();
          for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print("*");
            }
            System.out.println();
          }


    }
    
}
