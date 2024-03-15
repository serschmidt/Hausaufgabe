package l37_Iterable.example1;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class IterableIteratorExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        // Получение Iterator
        Iterator<String> iterator = fruits.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

// Использование Iterator для перебора списка
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        List<String> list = new ArrayList<>();
        list.add("Pineapple");
        list.add("Pear");

        int result = Collections.binarySearch(list, "Pineapple");


    }
}
