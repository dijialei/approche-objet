package entites;

public class AdressePostale {
    int number;
    String name;
    int code;
    String ville;

    public AdressePostale() {
    }

    public AdressePostale(int number, String name, int code, String ville) {
        this.number = number;
        this.name = name;
        this.code = code;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", ville='" + ville + '\'' +
                '}';
    }
}
