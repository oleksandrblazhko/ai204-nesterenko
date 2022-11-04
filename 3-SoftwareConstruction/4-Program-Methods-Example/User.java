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
    //Створення нового запису
    public void addRecord(User user){
        Record record = new Record(user);
    }
    //Замовлення води
    public String[] requestWater(User user, Premium card, BigInteger num, int cvv, String address){
        int userId = user.getUserId();
        return new Record(user).BuyPrem(card,user,num,cvv,address);
    }
}
