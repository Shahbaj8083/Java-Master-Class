public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse=0; int lastDigit=0; int num=number;
        if(number>0){//this is for positive number
        while(number>0) {
            lastDigit = number % 10;//remainder
            reverse = reverse * 10 + lastDigit ;
            number= number / 10;
        }}

        if(number<0){//this is for negative number
        while(number<0) {
            lastDigit = number % 10;//remainder
            reverse = reverse * 10 + lastDigit ;
            number= number / 10;
        }}
        if(num==reverse)  {
            return true;
        }
        return false;
    }

}
