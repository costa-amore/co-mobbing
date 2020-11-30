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
        void of_first_day_first_sentence_is_generated() {
            assertEquals("On the first day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(1, 1));
        }

        @Test
        void of_first_day_second_sentence_is_generated() {
            assertEquals("My true love gave to me:", TwelveDaysOfChristmass.giveMeYourLyrics(1, 2));
        }

        @Test
        void of_first_day_third_sentence_is_generated() {
            assertEquals("A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics(1, 3));
        }

        @Test
        void of_first_day_all_sentences_are_generated() {
            assertEquals("On the first day of Christmas\n" +
                    "My true love gave to me:\n" +
                    "A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics(1));
        }
    }

    @Nested
    public class Day2 {
        @Test
        void of_second_day_first_sentence_is_generated() {
            assertEquals("On the second day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(2, 1));
        }
    }

    @Nested
    public class AllDays {

    }
}
