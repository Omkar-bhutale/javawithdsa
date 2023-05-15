import java.util.Scanner;

class MyException extends Exception{
    MyException(String str){
        super(str);
    }

}
public class TestCoustomException2 {
    public static void main(String[] args) {
        String userName =  null;
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter the login info");
        System.out.println("plz enter the your name");
        userName = sc.nextLine();
        boolean flag=false;
            for(int i=0;i<userName.length();i++){
                if(userName.charAt(i)==' '){
                    flag=true;
                }

            }
            try{
                if(flag){
                    throw new MyException("space input exception");

                }
            }
            catch(MyException e){
                System.out.println("plz do not enternthe space"+e.getMessage());
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                
            }
            finally{
                sc.close();
            }
            if(!flag)
            System.out.println("username is saved");


    }
    
}
