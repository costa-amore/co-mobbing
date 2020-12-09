import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwelveDaysOfChristmassBehavior {

    /* TDD steps :
         - fake it
         - obvious implementation
         - refactor
     */
    @Nested
    public class Day1 {
        @Test
        void first_sentence_is_generated() {
            assertEquals("On the first day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(1, 1));
        }

        @Test
        void second_sentence_is_always_the_same() {
            assertEquals("My true love gave to me:", TwelveDaysOfChristmass.giveMeYourLyrics(1, 2));
        }

        @Test
        void third_sentence_is_generated() {
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
        void first_sentence_is_generated() {
            assertEquals("On the second day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(2, 1));
        }
        @Test
        void second_sentence_is_always_the_same() {
            assertEquals("My true love gave to me:", TwelveDaysOfChristmass.giveMeYourLyrics(2, 2));
        }
        @Test
        void third_sentence_is_generated() {
            assertEquals("Two turtle doves and", TwelveDaysOfChristmass.giveMeYourLyrics(2, 3));
        }
        @Test
        void fourth_sentence_is_generated() {
            assertEquals("A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics(2, 4));
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
        void first_sentence_is_generated() {
            assertEquals("On the third day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(3, 1));
        }
        @Test
        void second_sentence_is_always_the_same() {
            assertEquals("My true love gave to me:", TwelveDaysOfChristmass.giveMeYourLyrics(3, 2));
        }
        @Test
        void third_sentence_is_generated() {
            assertEquals("Three french hens", TwelveDaysOfChristmass.giveMeYourLyrics(3, 3));
        }
        @Test
        void fourth_sentence_is_generated() {
            assertEquals("Two turtle doves and", TwelveDaysOfChristmass.giveMeYourLyrics(3, 4));
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
}
