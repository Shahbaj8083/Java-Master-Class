public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a,double b)
    {
       int value1=(int)(a*1000);
       int value2=(int)(b*1000);
       if(value1==value2) {
           return true;
       }
       else{
               return false;
           }
       }
    }

