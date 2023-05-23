package sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
        Iterator it = hash.iterator();
        int nombreLettres = 0;
        String payNl = "";
        while (it.hasNext()){
            String next = (String) it.next();
            if (next.length() > nombreLettres){
                nombreLettres= next.length();
                payNl = next;
            }
        }
        hash.remove(payNl);
        System.out.println(hash);

    }
}
