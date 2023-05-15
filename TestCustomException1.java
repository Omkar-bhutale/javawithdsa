import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String str){
        super(str);
    }
}

class TestCustomException1 {
    public static void main(String[] args) {
        
    
        int age;
       // Scanner sc = new Scanner(System.in);
      //  age = sc.nextInt();
        try(Scanner sc = new Scanner(System.in))//try with resources
        {
            age = sc.nextInt();
        if(age<18){
            throw new InvalidAgeException("enter the proper age");

        }
    }
    catch(InvalidAgeException e){
        System.out.println("you are not eligible to vote"+e);
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("in finally block");
      //  sc.close();
    }
    System.out.println("normal flow of prongram");

    }
    
}
