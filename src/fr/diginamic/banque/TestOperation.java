package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("2023", 123.56);
        operations[1] = new Credit("2024", 343.76);
        operations[2] = new Debit("2025", 236.96);
        operations[3] = new Debit("2026", 137.46);
        double total = 0.0;
        for (Operation op :
                operations) {
            System.out.println(op);
            if (op.getType().equals("Credit")) {
                total = total + op.getMontant();
            } else {
                total = total - op.getMontant();
            }
        }
        System.out.println(total);
    }
}
