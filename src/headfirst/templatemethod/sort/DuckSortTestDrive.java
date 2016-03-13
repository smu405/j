package headfirst.templatemethod.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("Daffy", 8), 
                        new Duck("Dewey", 2),
                        new Duck("Howard", 7),
                        new Duck("Louie", 2),
                        new Duck("Donald", 10), 
                        new Duck("Huey", 2)
         };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);
 
        System.out.println("\nAfter sorting:");
        display(ducks);
        //jsl 20151114 comparator
        Duck[] myDucks = {new Duck("Sang", 8), new Duck("Myung", 2), new Duck("Uni", 7)}; 
        Arrays.sort(myDucks, new DuckComparator());
        System.out.println("\nAfter sorting:");
        display(myDucks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
