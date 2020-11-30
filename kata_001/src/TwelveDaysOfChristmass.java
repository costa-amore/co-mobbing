public class TwelveDaysOfChristmass {

    public static String giveMeYourLyrics(int day, int sentence) {
        if (sentence == 1) return "On the " + numberOfDay(day) + " day of Christmas";
        if (sentence == 2) return "My true love gave to me:";
        return "A partridge in a pear tree.";
    }

    public static String giveMeYourLyrics(int day) {
        return  giveMeYourLyrics(1, 1)+"\n"+
                giveMeYourLyrics(1, 2)+"\n"+
                giveMeYourLyrics(1, 3)
                ;
    }

    private static  String numberOfDay(int day) {
        if (day == 1) return "first";
        return "second";
    }
}
