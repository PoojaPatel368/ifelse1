
import java.util.Scanner;
class  Interchange{
   public static void main(String[] args) {
      int x, y;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of X and Y");//enter value of x and y
      x = sc.nextInt();
      y = sc.nextInt();
      System.out.println("before interchange numbers: "+x +"  "+y);


      System.out.println("After interchange numbers: "+y +"   " + x);
      System.out.println( );
   }
}
