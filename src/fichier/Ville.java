package fichier;

public class Ville {
    private String nom;
    private String codeDepar;
    private String nomReg;
    private int popuTotale;

    public Ville() {
    }

    public Ville(String nom, String codeDepar, String nomReg, int popuTotale) {
        this.nom = nom;
        this.codeDepar = codeDepar;
        this.nomReg = nomReg;
        this.popuTotale = popuTotale;
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
     * @return codeDepar
     */
    public String getCodeDepar() {
        return codeDepar;
    }

    /**
     * 设置
     * @param codeDepar
     */
    public void setCodeDepar(String codeDepar) {
        this.codeDepar = codeDepar;
    }

    /**
     * 获取
     * @return nomReg
     */
    public String getNomReg() {
        return nomReg;
    }

    /**
     * 设置
     * @param nomReg
     */
    public void setNomReg(String nomReg) {
        this.nomReg = nomReg;
    }

    /**
     * 获取
     * @return popuTotale
     */
    public int getPopuTotale() {
        return popuTotale;
    }

    /**
     * 设置
     * @param popuTotale
     */
    public void setPopuTotale(int popuTotale) {
        this.popuTotale = popuTotale;
    }

    public String toString() {
        return "Ville{nom = " + nom + ", codeDepar = " + codeDepar + ", nomReg = " + nomReg + ", popuTotale = " + popuTotale + "}";
    }
}
