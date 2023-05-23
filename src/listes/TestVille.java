package listes;

import java.util.ArrayList;


public class TestVille {
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
        int indexPeup = 0;
        int indexMoinsPeup = 0;

        int peupMax = arrayVilles.get(0).getNb();
        int peupMin = arrayVilles.get(0).getNb();

        for (int i = 0; i < arrayVilles.size(); i++) {
            if (arrayVilles.get(i).getNb() < peupMin) {
                peupMin = arrayVilles.get(i).getNb();
                indexMoinsPeup = i;
            }
            if (arrayVilles.get(i).getNb() > peupMax) {
                peupMax = arrayVilles.get(i).getNb();
                indexPeup = i;
            }

        }
        System.out.println(arrayVilles.get(indexPeup));
        arrayVilles.remove(indexMoinsPeup);
        for (int i = 0; i < arrayVilles.size(); i++) {
            if (arrayVilles.get(i).getNb() > 100000) {
                Ville ville = arrayVilles.get(i);
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        System.out.println(arrayVilles);
    }
}
