import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        int rows;
        System.out.println("ente the rows");
        rows=in.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=rows;j>i+1;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
