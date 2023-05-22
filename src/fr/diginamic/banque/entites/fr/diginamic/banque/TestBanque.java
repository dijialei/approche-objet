package fr.diginamic.banque.entites.fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte newCompte = new Compte(12345678,123);
        System.out.println(newCompte);
    }
}
