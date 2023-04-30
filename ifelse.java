import java.util.Scanner;

class ifelse{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("enter a");
        // int a=input.nextInt();
        // System.out.println("enter b");
        // int b=input.nextInt();
        // System.out.println("enter c");
        // int c=input.nextInt();
        Scanner in = new Scanner(System.in);
   
        System.out.print("Input the 1st number: ");
        int a= in.nextInt();
         
        System.out.print("Input the 2nd number: ");
        int b = in.nextInt();
         
        System.out.print("Input the 3rd number: ");
        int c = in.nextInt();
        if(a>b&&a>c){
            System.out.println("a is greatest" + a);

        }else if(b>c&&b>a){
            System.out.println("b is greatest" + b);
        }else{
            System.out.println("c is gratest" + c);
        }

    }
}