package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeString {
    public static void main(String[] args) {
        String[] array ={"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);
        int maxLettre = 0;
        String laVille = "";
        for (String ville:
             arrayList) {
            if (ville.length() > maxLettre) {
                laVille = ville;
                maxLettre = ville.length();
            }
        }
        System.out.println(laVille);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i).toUpperCase());
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String ville = arrayList.get(i);
            if (ville.startsWith("N")) arrayList.remove(i);
        }
        System.out.println(arrayList);
    }
}
