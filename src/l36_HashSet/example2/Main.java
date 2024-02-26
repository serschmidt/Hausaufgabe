package l36_HashSet.example2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new LinkedList();

        queue.offer("Apple");
        queue.offer("Banana");

        System.out.println(queue.poll());
        System.out.println(queue.peek());


    }
}

/*
поступает строка
String data
удлалить дублирующиеся символы сформировав из строки - коллекцию
преобразовать к списку и отсортировать
 */
