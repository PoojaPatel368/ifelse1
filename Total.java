
import java.util.Scanner;

public class Total {
    //hello


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //add number
        System.out.print("Input first number: ");

        double numberOne = scanner.nextDouble();
        //add number
        System.out.print("Input second number: ");
        double numberTwo = scanner.nextDouble();
        //add number
        System.out.print("Input third number: ");
        double numberThree = scanner.nextDouble();
        //add number
        System.out.println("Input fourth number: ");
        double numberFourth = scanner.nextDouble();
        //add number
        System.out.println("Input fifth number: ");
        double numberFifth = scanner.nextDouble();
        double average = averageOf(numberOne, numberTwo, numberThree, numberFourth, numberFifth);

        System.out.println
                ("Average of (" + numberOne + ", " + numberTwo + ", " + numberThree + "," + numberFourth + "," + numberFifth + ") is = " + average);

        scanner.close();
    }

    public static double averageOf(double num1, double num2, double num3, double num4, double num5) {
        return ((num1 + num2 + num3 + num4 + num5) / 5);
    }
}
