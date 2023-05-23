package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> hash = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
        System.out.println(hash);
        Iterator it = hash.iterator();
        double max = (double) it.next();
        double min = max;
        while (it.hasNext()) {
            double next = (double) it.next();
            if (next > max) max = next;
            if (next < min) min = next;
        }
        System.out.println(max);
        hash.remove(min);
        System.out.println(hash);
    }
}
