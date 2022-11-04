package com.example.demo.domain;

import java.math.BigInteger;

public class User {
    private int userId;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void addRecord(User user){
        Record record = new Record(user);
    }

    public String[] requestWater(User user, Premium card, BigInteger num, int cvv, String address){
        int userId = user.getUserId();
        return new Record(user).BuyPrem(card,user,num,cvv,address);
    }
}
