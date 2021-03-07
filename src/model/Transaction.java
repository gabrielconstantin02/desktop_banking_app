package model;

public class Transaction {
    private int transaction_id;
    private int sender_id;
    private int receiver_id;
    private String date;
    private int amount;

    public Transaction(int sender_id, int receiver_id, String date, int amount) {
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.date = date;
        this.amount = amount;
    }
    public Transaction(){

    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
