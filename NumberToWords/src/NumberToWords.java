//difficulty level:- tough
public class NumberToWords {
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        if(number==0){
            System.out.println("Zero");
        }
        int rem,rev=0;
        int originalNumber=number;
        number=reverse(number);//assigning reverse number into number
        int count=getDigitCount(number);


            while (number > 0) {
                rem = number % 10;//rem is rightmost digit

                switch (rem) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }
                number = number / 10;//this deletes the rightmost digit ignoring decimal value
            }
        if(count<getDigitCount(originalNumber)) {
            int requiredZero = getDigitCount(originalNumber) - count;//zeros required after the number
            for (int i = 1; i <= requiredZero; i++) {
                System.out.println("Zero");
            }
        }
        }

    public static int reverse(int num){
        int originalNum=num;
        int rem,rev=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;//reversing the positive number
            num=num/10;
        }
        if(num<0){
            while(num<0){
                rem=num%10;
                rev=rev*10+rem;// reversing negative number
                num=num/10;
            }
        }
        return rev;
        }


    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int rem,count=0;
        do{               //do while loop is required because for digit zero at least loop should run one time
            rem=number%10;
            count++;
            number=number/10;
        }
        while(number>0);
        return count;
    }
}
