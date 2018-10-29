package com.devil.dto;

import java.io.Serializable;
import java.util.Date;
public class ContrParams implements Serializable {
    private String name;
    private Date date;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ContrParams() {
    }

    public ContrParams(String name, Date date) {
        this.name = name;
        this.date = date;
    }
}
