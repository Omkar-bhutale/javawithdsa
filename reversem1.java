import java.util.Scanner;

public class reversem1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");

        String s1 =new String();
        StringBuffer s2 = new StringBuffer();
        s1 = sc.nextLine();
        //System.out.println(s1.substring(6, 13));
        for(int i=0;i<s1.length();){
            int j;
            for(j = i;(j<s1.length()&&s1.charAt(j)!=' ');j++){}
                s2.append(reverseWord(s1.substring(i, j)));
                s2.append(' ');
                i=++j;
        }
        System.out.print("reversed string is ");
        System.out.println(s2);
        System.out.println();
    }
    
    

static StringBuffer  reverseWord(String str){
    StringBuffer res = new StringBuffer();
    for(int i = str.length()-1;i>=0;i--){
        res.append(str.charAt(i));
    }
    return res;
}

}