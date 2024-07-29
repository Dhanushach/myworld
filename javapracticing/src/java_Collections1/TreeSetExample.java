package java_Collections1;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.setName("Maheshbabu");
        h1.setRating(100);

        Hero h2 = new Hero();
        h2.setName("Ram");
        h2.setRating(95);

        Hero h3 = new Hero();
        h3.setName("Nani");
        h3.setRating(90);

        // Create a TreeSet to store Hero objects
        SortedSet<Hero> heroes = new TreeSet<>();
        heroes.add(h1);
        heroes.add(h2);
        heroes.add(h3);

        // Print the TreeSet
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}
