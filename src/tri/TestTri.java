package tri;

import listes.Ville;

import java.util.ArrayList;

import java.util.Collections;

public class TestTri {
    public static void main(String[] args) {
        ArrayList<Ville> arrayVilles = new ArrayList<>();
        Ville ville1 = new Ville("Nice", 343000);
        Ville ville2 = new Ville("Carcassonne", 47800);
        Ville ville3 = new Ville("Narbonne", 53400);
        Ville ville4 = new Ville("Lyon", 484000);
        Ville ville5 = new Ville("Foix", 9700);
        Ville ville6 = new Ville("Pau", 77200);
        Ville ville7 = new Ville("Marseille", 850700);
        Ville ville8 = new Ville("Tarbes", 40600);

        arrayVilles.add(ville1);
        arrayVilles.add(ville2);
        arrayVilles.add(ville3);
        arrayVilles.add(ville4);
        arrayVilles.add(ville5);
        arrayVilles.add(ville6);
        arrayVilles.add(ville7);
        arrayVilles.add(ville8);
        System.out.println(arrayVilles);
        //Collections.sort(arrayVilles);
        Collections.sort(arrayVilles, new ComparatorHabitant());
        System.out.println(arrayVilles);
        Collections.sort(arrayVilles, new ComparatorNom());
        System.out.println(arrayVilles);
    }
}
