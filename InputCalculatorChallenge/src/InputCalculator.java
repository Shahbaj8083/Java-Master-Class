import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc=new Scanner(System.in);

        int input,sum=0,count=0;

        while(true){
            System.out.println();
            boolean isInt=sc.hasNextInt();
            if(isInt){
                input=sc.nextInt();
                sum=sum+input;
                count++;

            }else{
                break;
            }
            sc.nextLine();
        }
        int average=(int)Math.round((double)(sum/count));
        System.out.println("SUM = " +sum+ " AVG = "+average);
    }
}
