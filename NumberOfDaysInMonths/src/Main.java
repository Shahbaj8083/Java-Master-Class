public class Main {
    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.isLeapYear(4));
        System.out.println(NumberOfDaysInMonth.isLeapYear(400));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2004));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1800));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2001));
    }
}
