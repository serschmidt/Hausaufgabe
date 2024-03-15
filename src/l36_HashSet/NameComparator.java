package l36_HashSet;

import java.util.Comparator;

public class NameComparator implements Comparator<Bobr> {
    //сравнение Обйектов по имени:
    @Override
    public int compare(Bobr bobr1, Bobr bobr2) {
        return bobr1.name.compareTo(bobr2.name);
    }

}
