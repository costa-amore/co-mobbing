public class TwelveDaysOfChristmass {

    public static final String FINAL_SENTENCE_ALL_DAYS = "A partridge in a pear tree.";

    public static String giveMeYourLyrics(int day, int sentence) {
        if (sentence == 1) return "On the " + numberOfDay(day) + " day of Christmas";
        if (sentence == 2) return "My true love gave to me:";
        if (sentence == 3) {
            if (day == 2) return "Two turtle doves and";
            if (day == 3) return "Three french hens";
        }
        if (sentence == 4) {
            if (day == 3) return "Two turtle doves and";
        }
        return FINAL_SENTENCE_ALL_DAYS;
    }

    public static String giveMeYourLyrics(int day) {

        String lyrics = giveMeYourLyrics(day, 1) + "\n" +
                        giveMeYourLyrics(day, 2) + "\n" +
                        giveMeYourLyrics(day, 3)
                ;

        if (day > 1) lyrics += "\n" + giveMeYourLyrics(day, 4);
        if (day > 2) lyrics += "\n" + giveMeYourLyrics(day, 5);

        return lyrics;
    }

    private static  String numberOfDay(int day) {
        if (day == 1) return "first";
        if (day == 2) return "second";
        if (day == 3) return "third";
        return "";
    }

    public static String giveMeYourLyrics() {
        return giveMeYourLyrics(1) + "\n" +
                "\n" +
                giveMeYourLyrics(2)
                ;
    }
}
