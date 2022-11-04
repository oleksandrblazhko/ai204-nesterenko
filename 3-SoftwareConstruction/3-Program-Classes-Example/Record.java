package com.example.demo.domain;

import java.math.BigInteger;
import java.util.List;

public class Record {
    private int recordId;
    private User userId;

    public Record(User userId) {

        this.userId = userId;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public String[] BuyPrem(Premium card, User user, BigInteger num,int cvv,String address){
        BigInteger clientCardNumber = card.getCardNumber();
        int clientCardCvv = card.getCvv();
        String clientAddress = card.getAddress();
        int clientId = user.getUserId();
        int recordId = getRecordId();
        return new String[]{String.valueOf(clientCardNumber), String.valueOf(clientCardCvv),clientAddress, String.valueOf(clientId), String.valueOf(recordId)};
    }

    public void AddData(Float water,String feeling,String text){
        Data data = new Data(water,feeling,text);
    }
}
