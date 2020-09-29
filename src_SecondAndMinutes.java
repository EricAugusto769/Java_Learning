public class SecondAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            int hour = minutes / 60;
            minutes = minutes % 60;

            String hourString = hour + "h";
            if(hour < 10){
                hourString = "0" + hourString;
            }

            String minuteString = minutes + "m";
            if(minutes < 10){
                minuteString = "0" + minuteString;
            }

            String secondsString = seconds + "s";
            if(seconds < 10){
                secondsString = "0" + secondsString;
            }
            return hourString + " " + minuteString + " " + secondsString;
        }
        return "Invalid value";
    }
    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds/60;
            seconds = seconds % 60;
            System.out.println(minutes + "m " + seconds + "s");
            return getDurationString(minutes,seconds);
        } else {
            return "Invalid Value";
        }
    }
}
