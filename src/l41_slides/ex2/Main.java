package l41_slides.ex2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "pineapple"};
        Stream<String> objectStream = Arrays.stream(strings);
//        objectStream = Stream.of(strings);

        objectStream
                .filter(s -> s.contains("p"))
                .map(s -> "$" + s)
                .sorted()
                .forEach(s -> System.out.println(s));


        System.out.println("---------------------");
        IntStream.range(0, 10)
                .filter(i -> i % 2 == 0)
                .map(i -> i + 20)
                .forEach(i -> System.out.println(i));

    }

}
