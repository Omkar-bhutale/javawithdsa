import java.util.ArrayList;
import java.util.Arrays;

class CoustomException extends Exception{
    CoustomException(String str){
        super(str);
    }
}


public class CheackedCoustomExcep {
    ArrayList<String> lang = new ArrayList<>(Arrays.asList("java","python","javascript"));
    public void cheackLang(String langu) throws CoustomException
    {
        if(lang.contains(langu)){
            throw new CoustomException(langu + "  alredy exist");

        }else{
            lang.add(langu);
            System.out.println(langu+"  is added to array list");
        }

        
    }
    public static void main(String[] args) {
        CheackedCoustomExcep obj = new CheackedCoustomExcep();
        try{obj.cheackLang("c++");
             obj.cheackLang("java");
             obj.cheackLang(null);}
            catch(CoustomException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("in finally block");
            }
    }
}
