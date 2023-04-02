import java.util.Scanner;

    public class Check {
// main method to check hello
        public static void main(String[] args) {
          //  taking input from the user using the Scanner
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter any caracter : ");
            char ch = scanner.next().charAt(0);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                System.out.println(ch + " is A ALPHABET.");//enter alphabet

            } else if(ch >= '0' && ch <= '9') {

                System.out.println(ch + " is A DIGIT.");//enter digit

            } else {

                System.out.println(ch + " is A SPECIAL CHARACTER.");//enter character
            }

        }
    }