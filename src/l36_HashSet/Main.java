package l36_HashSet;

import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


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

        //Создаём Map с помощью Hashmap;
        Set<String> setBobr = new HashSet<String>();
        for (Bobr bobr: bobrs) {
            setBobr.add(bobr.name);
        }
        System.out.println("Бобры в мешке HashSet: " + setBobr);


    }
}

//
//Поместите часть бобров из 35 домашки в мешок (в hashset) (надо переопределить equals и
//hashCode у них)
//Проитерируйтесь по (старому) списку бобров и проверьте для каждого есть ли он в мешке