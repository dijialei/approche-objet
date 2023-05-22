package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    private double taux;

    public CompteTaux(double taux) {
        this.taux = taux;
    }

    public CompteTaux(String number, double solde, double taux) {
        super(number, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() +
                "taux=" + taux ;
    }
}
