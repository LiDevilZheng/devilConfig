package com.devil.entity;

import java.io.Serializable;

public class Line implements Serializable {
    private Integer id;
    private Integer order_id;
    private Integer prod_id;
    private Integer count;
    private String unit;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public Line() {
    }

    public Line(Integer id, Integer order_id, Integer prod_id, Integer count, String unit, Double price) {
        this.id = id;
        this.order_id = order_id;
        this.prod_id = prod_id;
        this.count = count;
        this.unit = unit;
        this.price = price;
    }
}
