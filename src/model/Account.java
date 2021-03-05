package model;

public class Account {
    private String iban;
    private String currency;
    private String bic;
    private float balance;

    public Account(String iban, String currency, String bic) {
        this.iban = iban;
        this.currency = currency;
        this.bic = bic;
    }
    public Account(){

    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
