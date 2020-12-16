import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LyricsBehavior {
    @Test
    void when_removing_line_from_a_lyric_it_should_be_gone(){
        assertEquals("2\n"+
                             "3\n"+
                             "4",
                new Lyrics("1\n"+
                           "2\n"+
                           "3\n"+
                           "4")
                        .without_sentence(1)
                        .toString()
        );
    }

    @Test
    void when_removing_multiple_lines_from_a_lyric_they_should_be_gone(){
        assertEquals("2\n"+
                             "4",
                new Lyrics("1\n"+
                           "2\n"+
                           "3\n"+
                           "4")
                        .without_sentences(1, 3)
                        .toString()
        );

    }
}
