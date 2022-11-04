
package com.example.demo.domain;

import java.math.BigInteger;

public class Data {
    private int dataId;
    private Float volume;
    private String feeling;
    private String text;

    public int getDataId() {
        return dataId;
    }

    public Data(Float volume, String feeling, String text) {
        this.volume = volume;
        this.feeling = feeling;
        this.text = text;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setData(Float volume, String feeling, String text){
        this.volume = volume;
        this.feeling = feeling;
        this.text = text;
    }

}
