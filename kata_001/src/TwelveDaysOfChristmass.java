public class TwelveDaysOfChristmass {

    public static final String FINAL_SENTENCE_ALL_DAYS = "A partridge in a pear tree.";

    public static String giveMeYourLyrics(int day, int sentence) {
        if (sentence == 1) return "On the " + numberOfDay(day) + " day of Christmas";
        if (sentence == 2) return "My true love gave to me:";

        int delta = sentence-day;

        if (delta == 1) return "Two turtle doves and";
        if (delta == 0) return "Three french hens";
        if (delta == -1) return "Four calling birds";
        if (delta == -2) return "Five golden rings";
        if (delta == -3) return "Six geese a-laying";
        if (delta == -4) return "Seven swans a-swimming";
        if (delta == -5) return "Eight maids a-milking";
        if (delta == -6) return "Nine ladies dancing";
        if (delta == -7) return "Ten lords a-leaping";
        if (delta == -8) return "Eleven pipers piping";
        if (delta == -9) return "Twelve drummers drumming";

        return FINAL_SENTENCE_ALL_DAYS;
    }

    public static String giveMeYourLyrics(int day) {

        String lyrics = giveMeYourLyrics(day, 1) + "\n" +
                        giveMeYourLyrics(day, 2) + "\n" +
                        giveMeYourLyrics(day, 3)
                ;

        if (day > 1) lyrics += "\n" + giveMeYourLyrics(day, 4);
        if (day > 2) lyrics += "\n" + giveMeYourLyrics(day, 5);
        if (day > 3) lyrics += "\n" + giveMeYourLyrics(day, 6);
        if (day > 4) lyrics += "\n" + giveMeYourLyrics(day, 7);
        if (day > 5) lyrics += "\n" + giveMeYourLyrics(day, 8);
        if (day > 6) lyrics += "\n" + giveMeYourLyrics(day, 9);
        if (day > 7) lyrics += "\n" + giveMeYourLyrics(day, 10);
        if (day > 8) lyrics += "\n" + giveMeYourLyrics(day, 11);
        if (day > 9) lyrics += "\n" + giveMeYourLyrics(day, 12);
        if (day > 10) lyrics += "\n" + giveMeYourLyrics(day, 13);
        if (day > 11) lyrics += "\n" + giveMeYourLyrics(day, 14);


        return lyrics;
    }

    public static String giveMeYourLyrics() {
        return giveMeYourLyrics(1) + "\n" +
                "\n" +
                giveMeYourLyrics(2) + "\n" +
                "\n" +
                giveMeYourLyrics(3) + "\n" +
                "\n" +
                giveMeYourLyrics(4) + "\n" +
                "\n" +
                giveMeYourLyrics(5) + "\n" +
                "\n" +
                giveMeYourLyrics(6)
        ;
    }

    private static  String numberOfDay(int day) {
        if (day == 1) return "first";
        if (day == 2) return "second";
        if (day == 3) return "third";
        if (day == 4) return "forth";
        if (day == 5) return "fifth";
        if (day == 6) return "sixth";
        if (day == 7) return "seventh";
        if (day == 8) return "eight";
        if (day == 9) return "ninth";
        if (day == 10) return "tenth";
        if (day == 11) return "eleventh";
        if (day == 12) return "Twelfth";
        return "";
    }
}
