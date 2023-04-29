import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        int day;
        System.out.println("enter the day number");
        Scanner in = new Scanner(System.in);
        day = in.nextInt();
        switch (day) {
        
                case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("theusday");
                break;
                case 3:
                System.out.println("wenasday");
                break;

                case 4:
                System.out.println("friday");
                break;
                case 5:
                System.out.println("thustrday");
                break;
                case 6:
                System.out.println("saturday");
                break;
                case 7:
                System.out.println("sunday");
                break;
            default:
            System.out.println("enter the valid date");
                break;
        }

    }
    
}
