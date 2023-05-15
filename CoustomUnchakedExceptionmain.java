import java.util.*;

class CoustomException1 extends RuntimeException{
    public CoustomException1(String str){
        super(str);
    }
}
class CoustomUnchackedException{
    ArrayList<String> lang = new ArrayList<>(Arrays.asList("java","python","javascrpt"));
    public void cheackLang(String str){
        
    // throw exception if language already present in ArrayList
    if(lang.contains(str)) {
        throw new CoustomException1(str + " already exists");
      }
      else {
        // insert language to ArrayList
        lang.add(str);
        System.out.println(str + " is added to the ArrayList");
      }
    }
    public static void main(String[] args) {
        CoustomUnchackedException obj =   new CoustomUnchackedException();
        obj.cheackLang("swift");
        obj.cheackLang("java");
        
    }
      

}

// In the above example, we have extended the RuntimeException class to create an unchecked custom exception class.

// Here, you can notice that, we haven't declared any try...catch block. It is because the unchecked exception is checked at runtime.

// Besides that, other functionality of unchecked exception is similar to the above mentioned program
