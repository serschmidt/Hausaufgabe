package l42_Stream.ex1;

import com.sun.source.doctree.SeeTree;

import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {

        String[] strings = {
                "apple", "orange", "pineapple",
                "apple", "cucumber", "lemon", "lemon",
                "tomato", "corn", "cabbage", "banana",
                "lime", "lemon"
        };

        boolean result = Stream.of(strings)
                .peek(s -> System.out.println(s))
                .allMatch(s -> s.length() > 3);

        System.out.println("Alle Wörter länger als 3 Symbole: " + result);
    }
}
