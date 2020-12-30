import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import sun.awt.HKSCS;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwelveDaysOfChristmassBehavior {

    public static final int DAYS_SUPPORTED = 12;

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
    }
    @Nested
    public class Day4 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the forth day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(4, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Four calling birds", TwelveDaysOfChristmass.giveMeYourLyrics(4, 3));
        }
        @Test
        void full_lyrics_day_four() {
            assertEquals( "On the forth day of Christmas\n" +
                    "My true love gave to me:\n" +
                    "Four calling birds\n" +
                    "Three french hens\n" +
                    "Two turtle doves and\n" +
                    "A partridge in a pear tree.", TwelveDaysOfChristmass.giveMeYourLyrics(4));
        }
    }
    @Nested
    public class Day5 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the fifth day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(5, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Five golden rings", TwelveDaysOfChristmass.giveMeYourLyrics(5, 3));
        }
    }
    @Nested
    public class Day6 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the sixth day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(6, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Six geese a-laying", TwelveDaysOfChristmass.giveMeYourLyrics(6, 3));
        }
    }
    @Nested
    public class Day7 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the seventh day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(7, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Seven swans a-swimming", TwelveDaysOfChristmass.giveMeYourLyrics(7, 3));
        }
    }
    @Nested
    public class Day8 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the eight day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(8, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Eight maids a-milking", TwelveDaysOfChristmass.giveMeYourLyrics(8, 3));
        }
    }
    @Nested
    public class Day9 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the ninth day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(9, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Nine ladies dancing", TwelveDaysOfChristmass.giveMeYourLyrics(9, 3));
        }
    }
    @Nested
    public class Day10 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the tenth day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(10, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Ten lords a-leaping", TwelveDaysOfChristmass.giveMeYourLyrics(10, 3));
        }
    }
    @Nested
    public class Day11 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the eleventh day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(11, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Eleven pipers piping", TwelveDaysOfChristmass.giveMeYourLyrics(11, 3));
        }
    }
    @Nested
    public class Day12 {
        @Test
        void sentence_1_is_generated() {
            assertEquals("On the Twelfth day of Christmas", TwelveDaysOfChristmass.giveMeYourLyrics(12, 1));
        }
        @Test
        void new_sentence_3_is_inserted() {
            assertEquals("Twelve drummers drumming", TwelveDaysOfChristmass.giveMeYourLyrics(12, 3));
        }
    }

    @Ignore // move challenge.txt to lycircs & compare line by line
    void all_days_are_generated() throws IOException {
        String challengeInput = new String("");
        String sentenceRead;
        File file = new File("/Users/jurgendesmet/Dev/co-mobbing/kata_001/src/challenge.txt");
        BufferedReader bufferReader = new BufferedReader( new FileReader(file));
        while ((sentenceRead = bufferReader.readLine()) != null) {
            challengeInput = challengeInput.concat(sentenceRead + "\n");
        }
        assertTrue(challengeInput.contains(TwelveDaysOfChristmass.giveMeYourLyrics()));
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
