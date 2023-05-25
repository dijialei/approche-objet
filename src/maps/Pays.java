package maps;

public class Pays {
    private String nom;
    private int nb;
    private String continent;

    public Pays() {
    }

    public Pays(String nom, int nb, String continent) {
        this.nom = nom;
        this.nb = nb;
        this.continent = continent;
    }

    /**
     * 获取
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * 设置
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * 获取
     * @return nb
     */
    public int getNb() {
        return nb;
    }

    /**
     * 设置
     * @param nb
     */
    public void setNb(int nb) {
        this.nb = nb;
    }

    /**
     * 获取
     * @return continent
     */
    public String getContinent() {
        return continent;
    }

    /**
     * 设置
     * @param continent
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String toString() {
        return "Pays{nom = " + nom + ", nb = " + nb + ", continent = " + continent + "}";
    }
}
