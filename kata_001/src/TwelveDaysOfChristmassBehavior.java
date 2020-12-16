import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwelveDaysOfChristmassBehavior {

    public static final int DAYS_SUPPORTED = 3;

    @Nested
    public class Day1 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the first day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(1, 1));
        }

        @Test
        void first_sentence_3_is_inserted() {
            assertEquals("A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics(1, 3));
        }

        @Test
        void all_sentences_are_generated() {
            assertEquals("On the first day of Christmas\n" +
                    "My true love gave to me:\n" +
                    "A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics(1));
        }
    }
    @Nested
    public class Day2 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the second day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(2, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Two turtle doves and", TwelveDaysOfChristmass.giveMeYourLyrics(2, 3));
        }
        @Test
        void all_sentences_are_generated() {
            assertEquals("On the second day of Christmas\n" +
                    "My true love gave to me:\n" +
                    "Two turtle doves and\n" +
                    "A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics(2));
        }
    }
    @Nested
    public class Day3 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the third day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(3, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Three french hens", TwelveDaysOfChristmass.giveMeYourLyrics(3, 3));
        }
        @Test
        void all_sentences_are_generated() {
            assertEquals("On the third day of Christmas\n" +
                    "My true love gave to me:\n" +
                    "Three french hens\n" +
                    "Two turtle doves and\n" +
                    "A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics(3));
        }
    }

    @Test
    void all_days_are_generated() {
        assertEquals("On the first day of Christmas\n" +
                "My true love gave to me:\n" +
                "A partridge in a pear tree.\n"+
                "\n"+
                "On the second day of Christmas\n" +
                "My true love gave to me:\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics());
    }

    @Test
    void sentence_2_is_always_the_same(){
        for (int day=1; day<=DAYS_SUPPORTED; day++){
            assertEquals("My true love gave to me:", TwelveDaysOfChristmass.giveMeYourLyrics(day, 2));
        }
    }

    @Test
    void only_difference_with_previous_day_is_the_first_sentence_and_a_new_3rd_line_inserted (){
        for (int day = 1; day<= DAYS_SUPPORTED-1; day++) {
            final int nextDay = day + 1;
            assertEquals(
                    new Lyrics(TwelveDaysOfChristmass.giveMeYourLyrics(day)).without_sentences(1).toString(),
                    new Lyrics(TwelveDaysOfChristmass.giveMeYourLyrics(nextDay)).without_sentences(1, 3).toString()
            );
        }
    }

}
