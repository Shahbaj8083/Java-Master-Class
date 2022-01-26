import java.sql.SQLOutput;

public class MethodOverloading {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(1,2);
        calcFeetAndInchesToCentimeters(108);
    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inch){
        if((feet >= 0) && (inch >= 0 && inch <= 12)){
            double value=(feet*12*2.54+inch*2.54);//12 feet is equal to 1 inch
            System.out.println("centimeter "+ value);
            return value;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet=(int)inches/12;
            double inch=(int)inches%12;
            System.out.println("feet= "+feet+" and inches ="+inch );
            return calcFeetAndInchesToCentimeters(feet,inch);
        }
        return -1;
    }
}
