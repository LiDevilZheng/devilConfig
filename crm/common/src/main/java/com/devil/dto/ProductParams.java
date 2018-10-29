package com.devil.dto;

import com.devil.entity.Product;

import java.io.Serializable;
import java.util.List;

public class ProductParams extends PageBean<Product> implements Serializable {
    private String name;
    private String type;
    private String batch;

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
    public ProductParams(){

    }
    public ProductParams(String name, String type, String batch) {
        this.name = name;
        this.type = type;
        this.batch = batch;
    }

    public ProductParams(Integer pageNo, Integer pageSize, Integer from, Integer offset, Integer count, Integer pageCount, List<Product> list, String name, String type, String batch) {
        super(pageNo, pageSize, from, offset, count, pageCount, list);
        this.name = name;
        this.type = type;
        this.batch = batch;
    }
}
