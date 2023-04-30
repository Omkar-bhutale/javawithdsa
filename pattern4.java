import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows;
        System.out.println("enter the rows");
        rows = in.nextInt();
        int n=0;
        for(int i=rows;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int j=2*n+1;
            while(j>0){
                System.out.print("*");
                j--;

            }
            System.out.println();
            n++;


            }
        }


    }
    

