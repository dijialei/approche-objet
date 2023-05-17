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
   public void show(){
      System.out.println(this.nom.toUpperCase()+this.prenom);
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }

   public void setAdressPostale(AdressePostale adressPostale) {
      this.adressPostale = adressPostale;
   }

   public String getNom() {
      return nom;
   }

   public String getPrenom() {
      return prenom;
   }

   public AdressePostale getAdressPostale() {
      return adressPostale;
   }
}
