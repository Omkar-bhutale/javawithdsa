import java.util.Arrays;
public class Anagram {
 public static void main(String[] args) {
    String str1 ="school master";
    String str2="The classroom ";
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    char arr1[]=str1.toCharArray();
    char arr2[]=str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    // str1 = new String(arr1);
    // str2 = new String(arr2);
    // if(str1.equals(str2))
    if(Arrays.equals(arr1, arr2)){
        System.out.println("strings are anagram");

    }else{
        System.out.println("strings are not anagram");
    }

 } 
}
