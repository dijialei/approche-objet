package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        p1.nom="DI";
        p1.prenom= "Jialei";
        p1.adressPostale.number =560;
        p1.adressPostale.code = 34070;
        p1.adressPostale.name = "av.mondial";
        p1.adressPostale.ville ="Montpellier";
        Personne p2 = new Personne();
        p2.nom="SU";
        p2.prenom= "Li";
        p2.adressPostale.number =25;
        p2.adressPostale.code = 34000;
        p2.adressPostale.name = "av.georges";
        p2.adressPostale.ville ="Montpellier";
        Personne p3 =new Personne("DI","Lou");
        AdressePostale adressePostale = new AdressePostale(12,"av.clemenceau",34000,"Montpellier");
        Personne p4 = new Personne("Lee","Yonghui",adressePostale);
        System.out.println(p4);
    }
}
