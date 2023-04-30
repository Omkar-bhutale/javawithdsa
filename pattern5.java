import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = in.nextInt();

        for(int i=0;i<rows;i++){
            for(int  j=0;j<i;j++){
                System.out.print(" ");
            }
            int n=rows-i;
            for(int j= n*2-1;j>0;j--){
                System.out.print("+");
            }
            System.out.println();
        }
    }
    
}
