import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LyricsBehavior {
    @Test
    void when_removing_line_from_a_lyric_it_should_be_gone() {
        assertEquals("2\n" +
                        "3\n" +
                        "4",
                new Lyrics("1\n" +
                        "2\n" +
                        "3\n" +
                        "4")
                        .without_sentence(1)
                        .toString()
        );
    }

    @Test
    void when_removing_multiple_lines_from_a_lyric_they_should_be_gone() {
        assertEquals("2\n" +
                        "4",
                new Lyrics(
                        "1\n" +
                        "2\n" +
                        "3\n" +
                        "4")
                        .without_sentences(1, 3)
                        .toString()
        );

    }

    @Test
    void when_comparing_two_identical_lyrics_return_empty_lyrics(){
        Lyrics differences = new Lyrics("input")
                    .compare(new Lyrics("input"));
        assertEquals("", differences.toString());
    }

    @Test
    void when_comparing_two_different_lyrics_return_the_one_difference(){
        Lyrics differences = new Lyrics("input")
                    .compare(new Lyrics("output"));
        assertEquals("input <-> output", differences.toString());
    }
    @Test
    void when_comparing_two_different_lyrics_return_the_two_differences(){
        Lyrics differences = new Lyrics("input" + "\n" +
                        "input 2" + "\n" +
                        "input 3")
                .compare(new Lyrics("output"+ "\n" +
                        "input 2" + "\n" +
                        "output 3"));
        assertEquals("input <-> output" + "\n" +
                "input 3 <-> output 3",
                differences.toString());
    }

}