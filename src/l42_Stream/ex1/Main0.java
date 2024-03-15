package l42_Stream.ex1;

import java.util.stream.Stream;

public class Main0 {
    public static void main(String[] args) {
        //Wieviele Male trift man auf ein Wort in einer Sammlung von Wörtern

        // Array of Strings
        String[] strings = {
                "apple", "orange", "pineapple",
                "apple", "cucumber", "lemon", "lemon",
                "tomato", "corn", "cabbage", "banana",
                "lime", "lemon"
        };

        long lemonCount = Stream
                .of(strings)                //Quelle
                .filter(s -> s.equals("lemon")) // Zwischen operation
                .count();                   //

        System.out.println("Lemon count: " + lemonCount);
    }
}
