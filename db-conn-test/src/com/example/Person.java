package com.example;

public class Person {

    private String firstname;
    private String lastname;
    private String address;
    private String email;

    public Person(String firstname, String lastname, String address, String email) {
        setFirstname(firstname);
        setLastname(lastname);
        setAddress(address);
        setEmail(email);
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
