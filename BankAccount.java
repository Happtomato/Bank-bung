package BankÜbung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class BankAccount {
    //UserAccount
    User userAccount;

    //AccountBalance
    float balance;
    //currency
    String currency;
    //accountPurpose
    String accountPurpose;
    //accountName
    String accountName;
    //creationDate
    Date creationDate;
    //Transactions
    ArrayList<Transaction> transactions;

    //BankAccount(UserAccount, Currency, AccountPurpose, AccountName, CreationDate)
    public BankAccount(User userAccount, float balance, String currency, String accountPurpose, String accountName, Date creationDate) {
        this.userAccount = userAccount;
        this.balance = balance;
        this.currency = currency;
        this.accountPurpose = accountPurpose;
        this.accountName = accountName;
        this.creationDate = creationDate;
        transactions = new ArrayList<>();
    }
    //getBalance(UserAccount)
    public float getBalance() {
        return balance;
    }
    //addFunds(Value)
    public void addFunds(float amount) {
        if(amount > 0){
            balance += amount;
        }
        else if (amount < 0){
            balance -= amount;
        }
    }
    //removeFunds(Value)
    public void removeFunds(float amount) {
        if(amount > 0){
            balance -= amount;
        }
        else if (amount < 0){
            balance += amount;
        }
        else{
            balance = balance;
        }

    }
    //transferBalance(BankAccount)
    public void transferBalance(BankAccount to){
        if(balance > 0){
            to.addFunds(balance);
            balance = 0;
        }
    }
    //sortTransactions(BankAccount, Value)
    public ArrayList<Transaction> sortTransactions(Comparator<Transaction> comparator){

        transactions.sort(comparator);
        return transactions;
    }

    static class SortByAmount implements Comparator {
        public int compare(Object obj1, Object obj2) {
            // Make sure that the objects are Car objects
            Transaction a = (Transaction) obj1;
            Transaction b = (Transaction) obj2;

            if (a.amount < b.amount) return -1;
            if (a.amount > b.amount) return 1;
            return 0;
        }
    }
    static class SortByDate implements Comparator {
        public int compare(Object obj1, Object obj2) {
            // Make sure that the objects are Car objects
            Transaction a = (Transaction) obj1;
            Transaction b = (Transaction) obj2;

            if (a.transactionDate.after(b.transactionDate)) return -1;
            if (a.transactionDate.before(b.transactionDate)) return 1;
            return 0;
        }
    }


}