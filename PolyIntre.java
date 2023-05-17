import java.util.Scanner;

class PolyInter{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the lehngth");
        int l = in.nextInt();
        System.out.println("enter the breath");
        int b = in.nextInt();
        System.out.println("the area of rectangle is  ="+ rect.getArea(l, b));
        in.close();
        
    }
}
 
interface Polygoan{
    int getArea(int length,int breath );
}
class Rectangle implements Polygoan{
 // int area;
  public int getArea(int length ,int breath){
    return length*breath;
  }

}