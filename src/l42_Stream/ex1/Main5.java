package l42_Stream.ex1;

import java.util.stream.Stream;

public class Main5 {

    public static void main(String[] args) {

        String[] strings = {"Lorem",  "ipsum",  "dolor",  "sit",  "amet",  "consectetur",  "adipiscing",  "elit,",  "sed",  "do",  "eiusmod",  "tempor",  "incididunt",  "ut",  "labore",  "et",  "dolore",  "magna",  "aliqua.",  "Ut",  "enim",  "ad",  "minim",  "veniam,",  "quis",  "nostrud",  "exercitation",  "ullamco",  "laboris",  "nisi",  "ut",  "aliquip",  "ex",  "ea",  "commodo",  "consequat.",  "Duis",  "aute",  "irure",  "dolor",  "in",  "reprehenderit",  "in",  "voluptate",  "velit",  "esse",  "cillum",  "dolore",  "eu",  "fugiat",  "nulla",  "pariatur.",  "Excepteur",  "sint",  "occaecat",  "cupidatat",  "non",  "proident,",  "sunt",  "in",  "culpa",  "qui",  "officia",  "deserunt",  "mollit",  "anim",  "id",  "est",  "laborum.",  ""};


        String target = "dolor";

        long result = Stream
                .of(strings)
                .filter(s -> s.contains(target))
                .count();

        System.out.println("Слово " + target + " встречается " + result + " разa.");

        boolean test = Stream.of(strings)
                .anyMatch(s -> s.length() > 4);

        System.out.println(test);

    }
}
