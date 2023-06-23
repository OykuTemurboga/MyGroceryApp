package com.example.mygrocerystore.models;

public class ProfileModel {
    String name;
    String email;
    String number;
    String address;

    public ProfileModel(String name, String email, String number, String address) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
