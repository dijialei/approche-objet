package listes;

public class Ville implements Comparable<Ville> {
    private  String nom;
    private  int nb;

    public Ville() {
    }

    public Ville(String nom, int nb) {
        this.nom = nom;
        this.nb = nb;
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

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nb=" + nb +
                '}';
    }

    @Override
    public int compareTo(Ville o) {
        return this.getNb()-o.getNb();
    }
}
