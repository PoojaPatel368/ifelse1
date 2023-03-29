import java.util.Scanner;

public class UperLower {
    private static Scanner sc;
    public static void main(String[] args) {
        String Upper;

        sc= new Scanner(System.in);

        System.out.print("\nPlease Enter Uppercase String =  ");
        Upper = sc.nextLine();

        String lowStr2 = Upper.toLowerCase();
        System.out.println("\nThe Lowercase String  =  " + lowStr2);
    }
}