package fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit() {
    }

    public Credit(String date, double montant) {
        super(date, montant);
    }
    @Override
    public String getType(){
        return "Credit";
    }
}
