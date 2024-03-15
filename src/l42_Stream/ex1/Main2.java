package l42_Stream.ex1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {

        String result = IntStream.range(0,42)   //Source
                .mapToObj(i -> String.valueOf(i))       //intermedate operation
                .collect(Collectors.joining(","));  //terminate operation

        System.out.println(result);

    }
}
