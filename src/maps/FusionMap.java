package maps;

import java.util.HashMap;
import java.util.Set;

public class FusionMap {
    public static void main(String[] args) {
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
        // Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");
        //TODODéveloppements à réaliser ci-dessous
        HashMap<Integer, String> map3 = new HashMap<>();
        Set<Integer> keys = map1.keySet();
        for (Integer key : keys) {
            map3.put(key, map1.get(key));
        }
        keys = map2.keySet();
        for (Integer key : keys) {
            map3.put(key, map2.get(key));

        }
        System.out.println(map3);
    }
}
