public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        if((num1<10 || num1>1000) || (num2<10 || num2>1000)|| (num3<10 || num3>1000)){
            return false;
        }
        int rem1,rem2,rem3;
        rem1=num1%10;
        rem2=num2%10;
        rem3=num3%10;
        if(rem1==rem2 || rem2==rem3 || rem1==rem3){
            return true;
        }
        return false;
    }
    public static boolean isValid(int number){
        if(number<10 || number>1000){
            return false;
        }
        return true;
    }
}
