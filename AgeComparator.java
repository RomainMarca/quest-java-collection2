import java.util.*;

class AgeComparator implements Comparator<Hero> {
    public int compare(Hero hero1, Hero hero2) {

        if (hero1.getAge() == hero2.getAge()) {
            return 0;
        } else if (hero1.getAge() > hero2.getAge()) {
            return -1;
        } else {
            return 1;
        }
    }
}