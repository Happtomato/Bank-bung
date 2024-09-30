package BankÜbung;

import java.util.Date;

public class Transaction {
    //Transaction ID
    int transactionID;
    //Transaction Date
    Date transactionDate;
    //Transaction Purpose
    String transactionPurpose;
    //Transaction From
    User from;
    //Transation To
    User to;
    //Transaction Amount
    float amount;
    //Transaction Completed
    boolean completed;

    //Transaction(ID, Date, Purpose, From, To, Value, Completed)
    public Transaction(int transactionID, Date transactionDate, User from, User to, float amount, boolean completed) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.completed = completed;
    }
    //showTransaction()
    public Transaction showTransaction() {
        return new Transaction(transactionID, transactionDate, from, to, amount, completed);
    }

    //revertTransaciton()
    public String revertTransaction() {
        completed = false;
        return "Transaction reverted";
    }

    public String completeTransaction() {
        completed = true;
        return "Transaction completed";
    }

}
