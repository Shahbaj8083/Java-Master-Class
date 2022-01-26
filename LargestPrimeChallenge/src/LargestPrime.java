//difficulty level:- Difficult
public class LargestPrime{
    public static int getLargestPrime(int number){
        if(number<=0 || number==1){
            return -1;
        }
        else{
            int largestPrimeNumber=2;
            while(number>largestPrimeNumber){
                if(number%largestPrimeNumber!=0){
                    largestPrimeNumber++;
                }
                else {
                    number=number/largestPrimeNumber;//number is the largest prime number
                }
            }
        }
        return number;
    }
}