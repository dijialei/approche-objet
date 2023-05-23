package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        int max = arrayList.get(0);
        for (int number:
             arrayList) {
            if (max< number) max = number;
        }
        System.out.println(max);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)<0) arrayList.set(i,  (-arrayList.get(i))) ;
        }
        System.out.println(arrayList);

    }
}
