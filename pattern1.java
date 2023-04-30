//package polymarphisam;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
         System.out.println("star pattern");
         int n;
         Scanner in = new Scanner(System.in);
         System.out.println("enter the rows");
         n=in.nextInt();
         for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
    
}
