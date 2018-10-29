package com.devil.entity;

import java.io.Serializable;
import java.util.Date;

public class Contr implements Serializable {
    private Integer id;
    private String name;
    private Double money;
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public Contr(){

    }
    public Contr(Integer id, String name, Double money, String date) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
    }
}
