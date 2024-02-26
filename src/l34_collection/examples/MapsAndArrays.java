package l34_collection.examples;
import java.util.*;

class MapsAndArrays{
    public static void main(String[] args) {
        Map<String,String> hashTable = new Hashtable<>();
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        System.out.println(hashSet);
    }
}

class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");


        Iterator<String> iterator = new Iterator<>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}