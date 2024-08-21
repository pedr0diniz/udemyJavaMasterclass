package sec5expressionsstatementsandmore.sec553secondsandminuteschallenge;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(86461));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

//    public static String getDurationString(int seconds) {
//        if (seconds < 0) {
//            System.out.println("Invalid data for seconds(" + seconds + "). Must be a positive integer value");
//            return "Invalid Value!";
//        }
//
//        int hours = 0;
//        int minutes = 0;
//        int remainingSeconds = seconds;
//
//        if (seconds > 3600) {
//            hours += seconds / 3600;
//            remainingSeconds = remainingSeconds % 3600;
//        }
//
//        if (remainingSeconds > 60) {
//            minutes += remainingSeconds / 60;
//            remainingSeconds = remainingSeconds % 60;
//        }
//
//        String hoursString = hours < 10 ? "0" + hours : String.valueOf(hours);
//        String minutesString = minutes < 10 ? "0" + minutes : String.valueOf(minutes);
//        String secondsString = remainingSeconds < 10 ? "0" + remainingSeconds : String.valueOf(remainingSeconds);
//
//        return (hoursString + "h " + minutesString + "m " + secondsString + "s");
//    }
//
//    public static String getDurationString(int minutes, int seconds) {
//        boolean hasError = false;
//
//        if (minutes < 0) {
//            System.out.println("Invalid data for minutes(" + minutes + "). Must be positive integer value");
//            hasError = true;
//        }
//        if (seconds < 0 || seconds > 59) {
//            System.out.println("Invalid data for seconds(" + seconds + "). Must be between 0 and 59");
//            hasError = true;
//        }
//
//        return hasError ? "Invalid data passed!" : getDurationString((minutes * 60) + seconds);
//    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "). Must be positive integer value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "). Must be positive integer value";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "). Must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours < 10 ? "0" + hours : String.valueOf(hours);
        String minutesString = remainingMinutes < 10 ? "0" + remainingMinutes : String.valueOf(remainingMinutes);
        String secondsString = seconds < 10 ? "0" + seconds : String.valueOf(seconds);


        return (hoursString + "h " + minutesString + "m " + secondsString + "s");
    }
}
