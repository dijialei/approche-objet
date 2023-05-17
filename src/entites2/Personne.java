package entites2;

import entites.AdressePostale;

public class Personne {
   public String nom;
   public String prenom;
   public AdressePostale adressPostale = new AdressePostale();

   public Personne() {
   }
   public Personne(String nom, String prenom, AdressePostale adressPostale) {
      this.nom = nom;
      this.prenom = prenom;
      this.adressPostale = adressPostale;
   }

   public Personne(String nom, String prenom) {
      this.nom = nom;
      this.prenom = prenom;
   }

   @Override
   public String toString() {
      return "Personne{" +
              "nom='" + nom + '\'' +
              ", prenom='" + prenom + '\'' +
              ", adressPostale=" + adressPostale +
              '}';
   }
}
