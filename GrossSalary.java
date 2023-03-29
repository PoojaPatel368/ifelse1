import java.util.Scanner;

public class GrossSalary {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //enter employee name
        System.out.println("please Enter Employee Name:");
        String name = scanner.nextLine();
        //enter employee id
        System.out.println("please Enter Employee ID");
        int id = scanner.nextInt();
        //add basic salary
        System.out.println("Basic salary:");
        double basicsalary = scanner.nextInt();
        double hra,da,ta,pf,gross;
        hra=basicsalary*0.10;
        System.out.println("This is HRA:"+hra);
        da=basicsalary*0.08;
        System.out.println("This is DA:"+da);
        ta=basicsalary*0.09;
        System.out.println("This is TA:"+ta);
        pf=basicsalary*0.20;
        System.out.println("This is PF:"+pf);
        gross=hra+da+ta-pf;
        System.out.println("This is gross salary:"+gross);
    }}



































