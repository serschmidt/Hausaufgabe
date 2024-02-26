package l35_corparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Bobr> bobrs = new LinkedList<>();
        //выбреаем бобров
        Bobr bobr1 = new Bobr("Бобр", 9, 20);
        Bobr bobr2 = new Bobr("Бобриха", 8, 15);
        Bobr bobr3 = new Bobr("Чип", 2, 5);
        Bobr bobr4 = new Bobr("Дайл", 3, 10);
        Bobr bobr5 = new Bobr("БобрДедушка", 15, 40);

        //создаю лист с бобрами
        bobrs.add(bobr1);
        bobrs.add(bobr2);
        bobrs.add(bobr3);
        bobrs.add(bobr4);
        bobrs.add(bobr5);

        //покажи бобров
        System.out.println("Семья бобров: " + bobrs);

        //сортировка по возрасту
        Collections.sort(bobrs);
        System.out.println("Семья бобров сортированные по возрасту: " + bobrs);

        //сортировка по имени:
        Collections.sort(bobrs, new NameComparator());
        System.out.println("Семья бобров сортированные по имени: " + bobrs);

        //сортировка по количеству родственников:
        Collections.sort(bobrs, new RelativeCountComparator());
        System.out.println("Семья бобров сортированные по количеству родственников: " + bobrs);

        //сортировка по имени с помощью Ламбда выражения
        Collections.sort(bobrs, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println("Семья бобров сортированные по имени: " + bobrs);

        //сортировка по имени с помощью Ламбда выражения
        bobrs.sort((o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println("Семья бобров сортированные по имени: " + bobrs);


        //Создаём Map с помощью Hashmap;
        Map<String, Integer> map = new HashMap<>();
        for (Bobr bobr: bobrs) {
            map.put(bobr.name, bobr.relativeCount);
        }
        System.out.println(map);

    }
}

//
//Создайте значит класс Bobr и определите у бобра поля name, age и relativesCount.
//Реализуйте интерфейс Comparable и переопределите метод compareTo чтобы сравнивались поля age
//Создайте класс NameComparator и RelativesCountComparator (реализуйте интерфейс java.util.Comporator)
//Поместите бобров в список (выберите сами какой список, он должен реализовывать интерфейс List)
//Отсортируйте список используя Collections.sort
//Отсортируйте список используя Collections.sort и созданые компораторы
//Отсортируйте список используя Collections.sort используя лямбда выражения вместо компараторов
//после всей этой сортировки сформируйте Map (например Hashmap) c данными вида имя бобра (ключ) и
//количество родственников (значение) и выведите этот map