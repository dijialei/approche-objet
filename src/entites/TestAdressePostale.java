package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale ap1 = new AdressePostale();
        ap1.number =560;
        ap1.code = 34070;
        ap1.name = "av.mondial";
        ap1.ville ="Montpellier";
        AdressePostale ap2 = new AdressePostale();
        ap2.number =25;
        ap2.code = 34000;
        ap2.name = "av.georges";
        ap2.ville ="Montpellier";

        AdressePostale ap3 = new AdressePostale(12,"av.clemenceau",34000,"Montpellier");


    }
}
