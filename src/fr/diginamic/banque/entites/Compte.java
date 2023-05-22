package fr.diginamic.banque.entites;

public class Compte {
    private int number;
    private int solde;

    public Compte() {
    }

    public Compte(int number, int solde) {
        this.number = number;
        this.solde = solde;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "number=" + number +
                ", solde=" + solde +
                '}';
    }
}
