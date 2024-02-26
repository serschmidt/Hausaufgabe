package l36_HashSet.example1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        boolean isNew = fruits.add("Cherry");

        System.out.println("Вы добавили: " + isNew);




    }
}
