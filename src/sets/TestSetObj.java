package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetObj {
    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>();
        Pays pay1 = new Pays("USA", 33353, 76348);
        Pays pay2 = new Pays("France", 42409, 6565);
        Pays pay3 = new Pays("Allemagne", 8379, 48636);
        Pays pay4 = new Pays("UK", 6779, 45295);
        Pays pay5 = new Pays("Italie", 5898, 34113);
        Pays pay6 = new Pays("Japon", 12517, 33822);
        Pays pay7 = new Pays("Chine", 141255, 12814);
        Pays pay8 = new Pays("Russie", 14344, 15444);
        Pays pay9 = new Pays("Inde", 142333, 2379);
        pays.add(pay1);
        pays.add(pay2);
        pays.add(pay3);
        pays.add(pay4);
        pays.add(pay5);
        pays.add(pay6);
        pays.add(pay7);
        pays.add(pay8);
        pays.add(pay9);
        Iterator it = pays.iterator();
        Pays payPIBImpor = new Pays();
        Pays payPIBMax = new Pays();
        int payPIB = 0;
        double payPIBTotale = 0;
        while (it.hasNext()) {
            Pays next = (Pays) it.next();
            if (next.getPib() > payPIB) {
                payPIB = (int) next.getPib();
                payPIBImpor = next;
            }
            if (next.getPib() * next.getNb() > payPIBTotale) {
                payPIBTotale = next.getPib() * next.getNb();
                payPIBMax = next;
            }

        }
        System.out.println("PIB/habitant le plus important" + payPIBImpor);
        System.out.println(" PIB total le plus important" + payPIBMax);
    }
}
