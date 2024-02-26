package l36_HashSet.example4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(4);

        System.out.println(
                list.stream().filter(o -> o>=3).findFirst()
        );
        int[] data = {1, 2, 3, 4};
        System.out.println(
              Arrays.asList(1,2,4,5)
        );
    }
}
