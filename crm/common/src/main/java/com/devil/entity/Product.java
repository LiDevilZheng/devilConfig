package com.devil.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;
    private String name;
    private String type;
    private String batch;
    private String unit;
    private Double price;
    private String memo;
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Product() {
    }

    public Product(String name, String type, String unit, Double price, Integer count) {
        this.name = name;
        this.type = type;
        this.unit = unit;
        this.price = price;
        this.count = count;
    }

    public Product(Integer id, String name, String type, String batch, String unit, Double price, String memo, Integer count) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.batch = batch;
        this.unit = unit;
        this.price = price;
        this.memo = memo;
        this.count = count;
    }
}
