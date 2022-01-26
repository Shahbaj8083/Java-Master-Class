public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int rem=0; int numFilter=0;//numFilter is evenNumbers
        while(number>0){
            rem=number%10;
            if(rem%2==0){
                numFilter=numFilter+rem;//this adds even numbers
            }
            number=number/10;//this helps the loop by decreasing the number
        }
        return numFilter;
    }
}
