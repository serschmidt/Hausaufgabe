package l35_corparator;

import java.util.Comparator;

public class RelativeCountComparator implements Comparator<Bobr>{

    //@Override
    public int compare(Bobr bobr1, Bobr bobr2) {
        if (bobr1.relativeCount < bobr2.relativeCount) {
            return -1;
        } else if (bobr1.relativeCount > bobr2.relativeCount) {
            return 1;
        } else {
            return 0;
        }
    }
}
