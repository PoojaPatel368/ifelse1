import java.util.Scanner;
  public class StudentGrade {
    public static class ResultGrade{
        //hello
        public void grade(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter name;"+"\n"+"Roll Number:"+"\n"+"MathsMark:"+"\n"+"sciMark:"+"\n"+"EngMark:");
            String name = scanner.nextLine();
            int rollNumber=scanner.nextInt();
            int mathsMark=scanner.nextInt();
            int sciMark=scanner.nextInt();
            int engMark=scanner.nextInt();
            int total=(mathsMark+sciMark+engMark);
            double percentage=((total/3));
            System.out.println("total of three subject "+ total);
            System.out.println("percentage of three subject"+percentage);
            if(percentage>=80)
                System.out.println("grade=a+");
            else if (percentage>=60) {
                System.out.println("grade=a");
            }else if (percentage>=50) {
                System.out.println("grade=b");
            }else if (percentage>=35) System.out.println("grade=c");{
                System.out.println("your percentage is="+percentage);
                if (mathsMark >= 35 && sciMark >= 35 && engMark >= 35)
                {
                    System.out.println("you are pass");
                }
                else {
                    System.out.println("you are fail");
                }



            }}}

    public static void main(String[] args){
        ResultGrade resultGrade;
        resultGrade = new ResultGrade();
        resultGrade.grade();
    }

}






