package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreationMap {
    public static void main(String[] args) {
        Map<String, Integer> mapSalaires = new HashMap<>();
        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);
        System.out.println(mapSalaires);
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        //TODODéveloppements à réaliser ci-dessous
        mapVilles.put(59,"Lille");
        mapVilles.put(69,"Lyon");
        mapVilles.put(33,"Bordeaux");
        Set<Integer> keys = mapVilles.keySet();
        for (Integer key : keys) {
            System.out.println(key);
            System.out.println(mapVilles.get(key));
        }
        System.out.println(mapVilles.size());

    }
}
