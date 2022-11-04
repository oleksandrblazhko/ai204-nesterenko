package com.example.demo.domain;

import java.math.BigInteger;

public class Premium {
    private int premiumId;
    private BigInteger cardNumber;
    private int cvv;
    private String address;

    public void setCard(BigInteger cardNumber, int cvv, String address) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.address = address;
    }

    public int getPremiumId() {
        return premiumId;
    }

    public void setPremiumId(int premiumId) {
        this.premiumId = premiumId;
    }

    public BigInteger getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(BigInteger cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
