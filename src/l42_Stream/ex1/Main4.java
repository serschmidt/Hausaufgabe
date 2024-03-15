package l42_Stream.ex1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {

        int[] data = {5,3,4,6,55,4,7,46,53,4,55,4};

        IntStream.of(data)
                .sorted()
                .skip(data.length - 5)
                .forEach(i -> System.out.println(i));

        int[] result = IntStream.of(data)
                .sorted()
                .skip(data.length - 5)
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}
