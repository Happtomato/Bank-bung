package BankÜbung;

import java.util.Date;
import java.util.HashMap;

public class Bank {

    //BankName
    String bankName;
    //BankFoundingDate
    Date bankFoundingDate;

    //Bankaccount[] Bankaccounts
    HashMap<User, BankAccount> BankAccounts;
    //User[] Users
    User[] users;

    //Bank(BankName, BankFoundingDate)
    public Bank(String bankName, Date bankFoundingDate){
        this.bankName = bankName;
        this.bankFoundingDate = bankFoundingDate;
    }
    //getBankAccounts(User)
    public HashMap<User, BankAccount> getBankAccounts(User user) {
        return BankAccounts;
    }

    //addNewAccount(BankAccount)
    public void addNewAccount(User user, BankAccount bankAccount) {
        BankAccounts.put(user, bankAccount);
    }
    //removeAccount(BankAccount)
    public void removeAccount(User user, BankAccount bankAccount) {
        BankAccounts.remove(user, bankAccount);
    }
    //getAccountSums()
    public float getAccountSum(){
        float sum = 0;
            for (BankAccount bankAccount : BankAccounts.values()) {
                sum += bankAccount.getBalance();
            }
        return sum;
    }

    //closeBankAccount(BankAccount, BankAccount)

    //openNewAccount(User)

    //transferOwnership(UserAccount, UserAccount)
}
