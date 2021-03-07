package model;

public class Deposit extends Account{
    private int nr_months;
    private String due_date;
    private boolean renewal;
    private float interest_rate;

    public Deposit(String iban, String currency, String bic, int nr_months, String due_date, boolean renewal) {
        super(iban, currency, bic);
        this.nr_months = nr_months;
        this.due_date = due_date;
        this.renewal = renewal;
    }

    public int getNr_months() {
        return nr_months;
    }

    public void setNr_months(int nr_months) {
        this.nr_months = nr_months;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public boolean isRenewal() {
        return renewal;
    }

    public void setRenewal(boolean renewal) {
        this.renewal = renewal;
    }

    public float getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }
}
