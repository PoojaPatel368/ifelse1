
import java.util.Scanner;
public class Week{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1 to 7: ");
       //check week name according number
        int a=scanner.nextInt();
        if(a==1) {
            System.out.println("sunday");
        } else if (a==2) {
            System.out.println("monday");
        }
                  if (a==3) {
                    System.out.println("tuesday");
                }else if(a==4) {
                            System.out.println("wednesday");
                } else if(a==5) {
                    System.out.println("thursday");
                } else if(a==6) {
                    System.out.println("friday");
                }   else if(a==7) {
                    System.out.println("saturday");
                } else{
                    System.out.println("invalid ");


                }
                }
            }
