package com.nesterenko;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        User user = new User("email@gmail.com","passwort");
        Record record = new Record(user);
        Premium premium = new Premium();
        Data data = new Data(0F,"Initial","Initial");
        premium.setCard(BigInteger.valueOf(1482822122),333,"Gretska,1a");
        record.AddData(1230.0F,"Добре","текст");
        record.BuyPrem(premium,user,premium.getCardNumber(),premium.getCvv(), premium.getAddress());
        System.out.println(record.toString());
        System.out.println(user.toString());
        System.out.println(premium.toString());
        System.out.println(data.toString());
    }
}
