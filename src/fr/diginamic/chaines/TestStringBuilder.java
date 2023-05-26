package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Long debut = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        Long fin = System.currentTimeMillis();
        System.out.println(fin - debut);
        String str = "";
        debut = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str+=i;
        }
        fin = System.currentTimeMillis();
        System.out.println(fin - debut);
    }
}
