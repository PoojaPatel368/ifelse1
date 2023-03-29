import java.util.Scanner;
public class City {
    public static class city
    {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.println("enter a letter from a to f: ");
         char letter = input.next().charAt(0);
         //using if-else
         if (letter == 'a') {
             System.out.println("Ahmedabad");
         } else if (letter == 'b'){
               System.out.println("Bombay");
         }else if (letter == 'c'){
             System.out.println("chennai");
         }else if (letter == 'd'){
             System.out.println("delhi");
         } else if (letter == 'e'){
             System.out.println("edinburgh");
         }  else if (letter == 'f'){
             System.out.println("france");
         } else {
             System.out.println("invalid entry");
     }
}}}

