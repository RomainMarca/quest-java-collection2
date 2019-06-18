import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Thanos {
    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)

        System.out.println("\nOrder by name:");
        Collections.sort(heroes, new NameComparator());
        Iterator itr = heroes.iterator();
        while (itr.hasNext()) {
            Hero heros = (Hero) itr.next();
            System.out.println(heros.getName() + ", " + heros.getAge());
        }

        // TODO 2: Add a Comparator and sort by age (descending)

        System.out.println("\nOrder by age:");

        Collections.sort(heroes, new AgeComparator());
        Iterator itrA = heroes.iterator();
        while (itrA.hasNext()) {
            Hero heros = (Hero) itrA.next();
            System.out.println(heros.getName() + ", " + heros.getAge());
        }

    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());

        }

    }
}