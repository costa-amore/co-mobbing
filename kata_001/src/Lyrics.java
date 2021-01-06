import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lyrics {

    private final List<String> sentences;

    public Lyrics(String raw_string_of_lyrics_sentences_separated_by_newline) {
        sentences = Arrays.asList(raw_string_of_lyrics_sentences_separated_by_newline.split("\\n"));
    }

    public Lyrics(List<String> list_of_lyrics_sentences) {
        sentences = list_of_lyrics_sentences;
    }

    public Lyrics without_sentence(int one_based_index_of_sentence_to_remove) {
        return without_sentences(one_based_index_of_sentence_to_remove);
    }

    public Lyrics without_sentences(Integer... one_based_index_of_sentence_to_remove) {
        return new Lyrics(
                IntStream
                        .range(0, sentences.size())
                        .filter(zero_based_index -> !Arrays
                                .asList(one_based_index_of_sentence_to_remove)
                                .contains(zero_based_index + 1))
                        .mapToObj(sentences::get)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public String toString() {
        return String.join("\n", sentences);
    }

    public Lyrics compare(Lyrics input) {
        StringBuilder returnValue = new StringBuilder();
        for (int i = 0; i < this.sentences.size(); i++) {
            if (!this.sentences.get(i).equals(input.sentences.get(i))) {
                returnValue
                        .append(returnValue.toString().equals("") ? "" : "\n")
                        .append(this.sentences.get(i))
                        .append(" <-> ")
                        .append(input.sentences.get(i));
            }

        }
        return new Lyrics(returnValue.toString());
    }
}
