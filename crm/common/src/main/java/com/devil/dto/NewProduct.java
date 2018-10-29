package com.devil.dto;

import com.devil.entity.Product;

import java.io.Serializable;

public class NewProduct extends Product implements Serializable {
    private Double subPrice;
    public Double getSubPrice() {
        subPrice=getCount()*getPrice();
        return subPrice;
    }
    public void setSubPrice(Double subPrice) {
        this.subPrice = subPrice;
    }
    public NewProduct(){

    }
    public NewProduct(Double subPrice) {
        this.subPrice = subPrice;
    }

    public NewProduct(String name, String type, String unit, Double price, Integer count, Double subPrice) {
        super(name, type, unit, price, count);
        this.subPrice = subPrice;
    }

    public NewProduct(Integer id, String name, String type, String batch, String unit, Double price, String memo, Integer count, Double subPrice) {
        super(id, name, type, batch, unit, price, memo, count);
        this.subPrice = subPrice;
    }
}
