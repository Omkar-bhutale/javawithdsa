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
        
    }
      

}