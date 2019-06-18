import java.util.*;

class NameComparator implements Comparator<Hero> {
    public int compare(Hero hero1, Hero hero2) {

        return hero1.getName().compareTo(hero2.getName());
    }
}