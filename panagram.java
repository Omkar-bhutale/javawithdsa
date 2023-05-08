import java.lang.reflect.Array;
import java.util.Arrays;

class panagram 
{
    public static void main(String[] args) {
        boolean flag = false;
        String str = "Pack my box with five dozen liquor jugs";
        str = str.replace(" ","" );
        str=str.toUpperCase();
        char arr[]=str.toCharArray();
        char bin[]=new char[26];
        Arrays.sort(arr);
        for(char ch:arr){
            bin[ch-65]++;
        }
        // for(int ele:bin){
        //     System.out.println(ele);
        // }
        for(int ele:bin){
            if(ele==0){
                flag=true;
            }

        }
        if(flag==true){
            System.out.println("string is not panagram");
        }else{
            System.out.print("string is panagram");
            
        }


    }

}
