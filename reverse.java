//omkarpackage java_program.string;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str ;
        System.out.println("enter the string");
        str = in.nextLine();
        StringBuffer res = new StringBuffer();
        for(int i = str.length()-1;i>=0;i--){
            res.append(str.charAt(i));
        }
        System.out.println(res);
        System.out.println("the revesed string is" +res);

    }
    
}
