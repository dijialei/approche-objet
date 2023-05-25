package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> pays= new ArrayList<>();
        Pays pay1 = new Pays("France",65,"Europe");
        Pays pay2 = new Pays("Allemagne",80,"Europe");
        Pays pay3 = new Pays("Belgique",10,"Europe");
        Pays pay4 = new Pays("Russie",150,"Asie");
        Pays pay5 = new Pays("Chine",1400,"Asie");
        Pays pay6 = new Pays("Indonésie",220,"Océanie");
        Pays pay7 = new Pays("Australie",20,"Océanie");
        pays.add(pay1);
        pays.add(pay2);
        pays.add(pay3);
        pays.add(pay4);
        pays.add(pay5);
        pays.add(pay6);
        pays.add(pay7);
        ArrayList<String> continents = new ArrayList<>();
        HashMap<String,Integer> continentsMap = new HashMap<>();
        for (Pays pay : pays) {
            if (!continents.contains(pay.getContinent())) continents.add(pay.getContinent());
        }

        for (String continent : continents) {
            int numberTotal = 0;
            for (Pays pay : pays) {
                if (continent.equals(pay.getContinent())) numberTotal+= pay.getNb();
            }
            continentsMap.put(continent,numberTotal);
        }
        System.out.println(continentsMap);
    }
}
