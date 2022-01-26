public class SharedDigit {
    public static boolean hasSharedDigit(int firstNum,int secondNum){
        if(firstNum<10 || firstNum>99 || secondNum<10 || secondNum>99) {
            return false;
        }
        int rem=0;int rem2=0;
        while(firstNum>9){
           rem=firstNum%10;
            firstNum=firstNum/10;

           while(secondNum>9){
               rem2=secondNum%10;
               secondNum=secondNum/10;
               if(rem==rem2 || firstNum==secondNum || rem==secondNum || firstNum==rem2){
                   return true;
               }
           }

        }
        return false;
    }
}
