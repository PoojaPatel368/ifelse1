import java.util.Scanner;
public class Positive {
    //hello


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int input = scanner.nextInt();
        if (input <0) {
            System.out.println("negative number");

        } else if (input >0) {
            System.out.println("positive number");

        } else  {
            System.out.println("zero number");
        }
    }
}
