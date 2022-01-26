package com.company;

public class Main {

    public static void main(String[] args) {
        int minIntValue=Integer.MIN_VALUE;
        int maxIntValue=Integer.MAX_VALUE;
        System.out.println("Minimum integer value="+minIntValue);
        System.out.println("Maximum integer value="+maxIntValue);

        System.out.println("Busted Minimum integer value="+(minIntValue-1));
        System.out.println("Busted Maximum integer value="+(maxIntValue+1));

        int maxIntTest=2147483647;

        byte minByteValue=Byte.MIN_VALUE;
        byte maxByteValue=Byte.MAX_VALUE;
        System.out.println("Minimum byte value="+minByteValue);
        System.out.println("Maximum byte value="+maxByteValue);

        short minShortValue=Short.MIN_VALUE;
        short maxShortValue=Short.MAX_VALUE;
        System.out.println("Minimum short value="+minShortValue);
        System.out.println("Maximum short value="+maxShortValue);

        long minLongValue=Long.MIN_VALUE;
        long maxLongValue=Long.MAX_VALUE;
        System.out.println("Minimum long value="+minLongValue);
        System.out.println("Maximum long value="+maxLongValue);

        // long a=2147483648; there is error in this code because the value is int bydefault
        long a=2147483648l;//by writing l or L it is corrected

        short newShort=(short)(minShortValue/2);//type casted
    }
}

