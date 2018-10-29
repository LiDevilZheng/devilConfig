package com.devil.entity;

import java.io.Serializable;

public class Storage implements Serializable {
    private Integer id;
    private Integer prod_id;
    private String products;
    private String warehouse;
    private String ware;
    private Integer count;
    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getWare() {
        return ware;
    }

    public void setWare(String ware) {
        this.ware = ware;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Storage(){

    }

    public Storage(Integer id, Integer prod_id, String products, String warehouse, String ware, Integer count, String memo) {
        this.id = id;
        this.prod_id = prod_id;
        this.products = products;
        this.warehouse = warehouse;
        this.ware = ware;
        this.count = count;
        this.memo = memo;
    }
}
