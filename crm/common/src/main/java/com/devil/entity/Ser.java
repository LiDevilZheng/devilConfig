package com.devil.entity;

import java.io.Serializable;

public class Ser implements Serializable {
    private Integer id;
    private String item;
    private Integer cou;
    private String yea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getCou() {
        return cou;
    }

    public void setCou(Integer cou) {
        this.cou = cou;
    }

    public String getYea() {
        return yea;
    }

    public void setYea(String yea) {
        this.yea = yea;
    }

    public Ser(){

    }

    public Ser(Integer id, String item, Integer cou, String yea) {
        this.id = id;
        this.item = item;
        this.cou = cou;
        this.yea = yea;
    }
}
