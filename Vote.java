
import java.util.Scanner;

public class Vote
    //hello
{
    Scanner scanner = new Scanner(System.in);

    public void eligibleforvote()//acknowledge the user want to enter
    {
        System.out.println();
        int age = scanner.nextInt();//storing age in variable using scanner objection
        if (age >= 18)
        {
            System.out.println("you are eligible for vote as you age is :" + age);//"please enter age"
        } else
        {
            System.out.println("you are not eligible for vote as you age is :" + age);
        }
    }

    public static void main(String[] args) {
        Vote programmer = new Vote();
        programmer.eligibleforvote();
    }
}