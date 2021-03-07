package model;

public class Card {
    private int card_number;
    private int ccv2;
    private String type;
    private String valid_thru;

    public Card(String type, String valid_thru) {
        this.type = type;
        this.valid_thru = valid_thru;
    }
    public Card(){

    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public int getCcv2() {
        return ccv2;
    }

    public void setCcv2(int ccv2) {
        this.ccv2 = ccv2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValid_thru() {
        return valid_thru;
    }

    public void setValid_thru(String valid_thru) {
        this.valid_thru = valid_thru;
    }
}
