package BankÜbung;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(new User(), 500F, "CHF", "sparen", "SparKonto", new Date(System.currentTimeMillis()));
        
    }
}
