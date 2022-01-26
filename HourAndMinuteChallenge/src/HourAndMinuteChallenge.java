public class HourAndMinuteChallenge {
    public  static String getDuration(int minutes,int seconds) {
        if (minutes < 0 || (seconds < 0) || (seconds > 59)) {
            return ("Invalid value");
        }
        int hours = minutes / 60;
        int newMin = minutes % 60;
        //hours
        String stringhours = hours + "hr ";
        if (hours < 10) {
            stringhours = "0" + stringhours;
        }
        //minutes
        String stringMin = newMin + "m ";
        if (newMin < 10) {
            stringMin = "0" + stringMin;
        }
        //seconds
        String stringSec = seconds + "s ";
        if (seconds < 10) {
            stringSec = "0" + stringSec;
        }
        return stringhours + stringMin + stringSec;
    }

    public static String getDuration(int seconds){
        if(seconds<0)
        {
            return "invalid value";
        }
        int min=seconds/60;
        int sec=seconds%60;
        return getDuration(min,sec);
    }
}
