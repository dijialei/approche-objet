package sets;

public class Pays {
    private String nom;
    private int nb;
    private double pib;



    public Pays() {
    }
    public Pays(String nom, int nb, double pib) {
        this.nom = nom;
        this.nb = nb;
        this.pib = pib;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nb=" + nb +
                ", PIBTotale=" + pib* nb +
                '}';
    }
}
