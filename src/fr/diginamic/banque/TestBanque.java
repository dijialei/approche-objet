package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("fr12345",234.57);

        CompteTaux compteTaux = new CompteTaux("fr12345",250.56,2.25);

        Compte[] compts = new Compte[2];
        compts[0] = compte;
        compts[1] = compteTaux;
        for (Compte cp: compts) {
            System.out.println(cp);
        }
    }

}
