package model;

public class Customer {
    private int id;
    private String first_name;
    private String last_name;
    private String cnp;
    private String email;

    public Customer(int id, String first_name, String last_name, String cnp, String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cnp = cnp;
        this.email = email;
    }

    public Customer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
