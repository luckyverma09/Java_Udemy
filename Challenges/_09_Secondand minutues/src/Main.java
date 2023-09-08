public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 34));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);

    }

    public static String getDurationString(int minutes, int seconds) {

        if ((seconds < 0) ) {
            return "Invalid Value";
        }


            seconds %= 60;
            int hours = minutes / 60;
            minutes %= 60;

            return (hours + "h " + minutes + "m " + seconds + "s");


    }
}
