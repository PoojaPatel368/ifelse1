
import java.util.Scanner;

public class Maths {
    //hello

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //add first amount
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        // add second amount
        System.out.print("Input second number: ");
        int num2 = in.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));


    }

}