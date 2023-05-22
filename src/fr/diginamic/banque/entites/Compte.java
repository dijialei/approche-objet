package fr.diginamic.banque.entites;

public class Compte {
    private String number;
    private  double solde;

    public Compte() {
    }

    public Compte(String number, double solde) {
        this.number = number;
        this.solde = solde;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "number='" + number + '\'' +
                ", solde=" + solde +
                '}';
    }
}
