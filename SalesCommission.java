import java.util.Scanner;

public class SalesCommission {
    //hello


    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        //add the name of employee
        System.out.println(" Enter Seller Name");
        String SellerName=scanner.nextLine();
         //add employee id
        System.out.println("Sales Id");
        int SalesId =scanner.nextInt();
        //add employee sales amount
        System.out.println("Sales Amount");
        double SalesAmount=scanner.nextDouble();
        // add basic sales amount
        System.out.println("Basic Salary");
        double basicSalary=scanner.nextDouble();
        if(SalesAmount>=10000) {
            System.out.println("commission is " + (SalesAmount * 0.05));
        }else if (SalesAmount>=20000)
        {       System.out.println("commission is "+(SalesAmount*0.10));
        } else if (SalesAmount>=30000) {
            System.out.println("commission is " + (SalesAmount * 0.20));

        } else if (SalesAmount>=50000) {
            System.out.println("commission is " + (SalesAmount * 35));
        }else
        {System.out.println("");}
    }
}