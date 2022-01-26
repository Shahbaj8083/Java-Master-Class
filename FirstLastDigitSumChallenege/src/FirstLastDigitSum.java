
//difficulty leve:-tough
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int originalNumber=number;
        int firstDigit=0,lastDigit=0;
            lastDigit=number%10;//it will store last digit no loop required
                while(number>9)
             {
                number = number / 10;//it will store first digit
                firstDigit=number;
            }
                if(originalNumber<10){
                    firstDigit=lastDigit;
            }
        return firstDigit+lastDigit;
    }
}
